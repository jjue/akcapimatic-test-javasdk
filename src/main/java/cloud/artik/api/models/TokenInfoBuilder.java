/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;

public class TokenInfoBuilder {
    //the instance to build
    private TokenInfo tokenInfo;

    /**
     * Default constructor to initialize the instance
     */
    public TokenInfoBuilder() {
        tokenInfo = new TokenInfo();
    }

    public TokenInfoBuilder clientId(String clientId) {
        tokenInfo.setClientId(clientId);
        return this;
    }

    public TokenInfoBuilder deviceId(String deviceId) {
        tokenInfo.setDeviceId(deviceId);
        return this;
    }

    public TokenInfoBuilder expiresIn(Integer expiresIn) {
        tokenInfo.setExpiresIn(expiresIn);
        return this;
    }

    public TokenInfoBuilder userId(String userId) {
        tokenInfo.setUserId(userId);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TokenInfo build() {
        return tokenInfo;
    }
}