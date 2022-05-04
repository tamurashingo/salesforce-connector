package io.github.tamurashingo.salesforce.connector;

public class Connection {

    private String accessToken;
    private String instanceUrl;
    private String id;
    private String tokenType;
    private String issuedAt;
    private String signature;

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public void setInstanceUrl(String instanceUrl) {
        this.instanceUrl = instanceUrl;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTokenType(String tokenType) {
        this.tokenType = tokenType;
    }

    public void setIssuedAt(String issuedAt) {
        this.issuedAt = issuedAt;
    }

    public void setSignature(String signature) {
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
