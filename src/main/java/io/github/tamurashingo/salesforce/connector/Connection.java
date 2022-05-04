package io.github.tamurashingo.salesforce.connector;

public class Connection {

    private final String accessToken;
    private final String instanceUrl;
    private final String id;
    private final String tokenType;
    private final String issuedAt;
    private final String signature;

    public Connection(String accessToken, String instanceUrl, String id, String tokenType, String issuedAt, String signature) {
        this.accessToken = accessToken;
        this.instanceUrl = instanceUrl;
        this.id = id;
        this.tokenType = tokenType;
        this.issuedAt = issuedAt;
        this.signature = signature;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public String getInstanceUrl() {
        return instanceUrl;
    }

    public String getId() {
        return id;
    }

    public String getTokenType() {
        return tokenType;
    }

    public String getIssuedAt() {
        return issuedAt;
    }

    public String getSignature() {
        return signature;
    }
}
