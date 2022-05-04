package io.github.tamurashingo.salesforce.connector;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Connection {

    @JsonProperty("access_token")
    private String accessToken;
    @JsonProperty("instance_url")
    private String instanceUrl;
    @JsonProperty("id")
    private String id;
    @JsonProperty("token_type")
    private String tokenType;
    @JsonProperty("issued_at")
    private String issuedAt;
    @JsonProperty("signature")
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
