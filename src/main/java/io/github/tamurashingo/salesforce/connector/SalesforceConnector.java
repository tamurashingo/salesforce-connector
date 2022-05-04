package io.github.tamurashingo.salesforce.connector;

import okhttp3.*;

public class SalesforceConnector {
    public static final String PRODUCTION_URL = "https://login.salesforce.com";
    public static final String SANDBOX_URL = "https://test.salesforce.com";

    protected HttpUrl baseUrl;

    protected FormBody.Builder form = new FormBody.Builder();

    public RequestBody requestBody() {
        return form.build();
    }

    public HttpUrl url() {
        return baseUrl.resolve("/services/oauth2/token");
    }

    public static PasswordRequestBuilder withPassword() {
        return new SalesforceConnector().new PasswordRequestBuilder();
    }

    public static RefreshTokenRequestBuilder withRefreshToken() {
        return new SalesforceConnector().new RefreshTokenRequestBuilder();
    }


    public abstract class RequestBuilder {
        public RequestBuilder loginUrl(String loginUrl) {
            baseUrl = HttpUrl.parse(loginUrl);
            return this;
        }

        public RequestBuilder production() {
            return loginUrl(PRODUCTION_URL);
        }

        public RequestBuilder sandbox() {
            return loginUrl(SANDBOX_URL);
        }

        public SalesforceConnector build() {
            return SalesforceConnector.this;
        }
    }

    public class PasswordRequestBuilder extends RequestBuilder {
        PasswordRequestBuilder() {
            form.add("grant_type", "password");
        }

        public PasswordRequestBuilder clientId(String clientId) {
            form.add("client_id", clientId);
            return this;
        }

        public PasswordRequestBuilder clientSecret(String clientSecret) {
            form.add("client_secret", clientSecret);
            return this;
        }

        public PasswordRequestBuilder username(String username) {
            form.add("username", username);
            return this;
        }

        public PasswordRequestBuilder password(String password) {
            form.add("password", password);
            return this;
        }
    }

    public class RefreshTokenRequestBuilder extends RequestBuilder {
        RefreshTokenRequestBuilder() {
            form.add("grant_type", "refresh_token");
        }

        public RefreshTokenRequestBuilder clientId(String clientId) {
            form.add("client_id", clientId);
            return this;
        }

        public RefreshTokenRequestBuilder clientSecret(String clientSecret) {
            form.add("client_secret", clientSecret);
            return this;
        }

        public RefreshTokenRequestBuilder refreshToken(String refreshToken) {
            form.add("refresh_token", refreshToken);
            return this;
        }
    }



}

