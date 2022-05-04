package io.github.tamurashingo.salesforce.connector;

import com.fasterxml.jackson.databind.ObjectMapper;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PasswordConnectorTest {

    @Test
    void connectProduction() throws Exception {
        SalesforceConnector connector = SalesforceConnector.withPassword()
                .clientId(System.getenv("SALESFORCE_CLIENT_ID"))
                .clientSecret(System.getenv("SALESFORCE_CLIENT_SECRET"))
                .username(System.getenv("SALESFORCE_USERNAME"))
                .password(System.getenv("SALESFORCE_PASSWORD"))
                .production()
                .build();


        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url(connector.url())
                .post(connector.requestBody())
                .build();

        try (Response response = client.newCall(request).execute()) {
            ObjectMapper mapper = new ObjectMapper();
            Connection connection = mapper.readValue(response.body().string(), Connection.class);

            assertNotNull(connection);
            assertNotNull(connection.getAccessToken());
            assertNotNull(connection.getInstanceUrl());
            assertNotNull(connection.getId());
            assertNotNull(connection.getTokenType());
            assertNotNull(connection.getIssuedAt());
            assertNotNull(connection.getSignature());
        }
    }


}
