/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;

public class RegisterMessageBuilder {
    //the instance to build
    private RegisterMessage registerMessage;

    /**
     * Default constructor to initialize the instance
     */
    public RegisterMessageBuilder() {
        registerMessage = new RegisterMessage();
    }

    /**
     * Confirmation ID.
     */
    public RegisterMessageBuilder cid(String cid) {
        registerMessage.setCid(cid);
        return this;
    }

    /**
     * Authorization header containing access token (Bearer <access_token>).
     */
    public RegisterMessageBuilder authorization(String authorization) {
        registerMessage.setAuthorization(authorization);
        return this;
    }

    /**
     * Source Device ID.
     */
    public RegisterMessageBuilder sdid(String sdid) {
        registerMessage.setSdid(sdid);
        return this;
    }

    /**
     * Timestamp (past, present or future). Defaults to current time if not provided.
     */
    public RegisterMessageBuilder ts(Long ts) {
        registerMessage.setTs(ts);
        return this;
    }

    /**
     * Type.
     */
    public RegisterMessageBuilder type(String type) {
        registerMessage.setType(type);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RegisterMessage build() {
        return registerMessage;
    }
}