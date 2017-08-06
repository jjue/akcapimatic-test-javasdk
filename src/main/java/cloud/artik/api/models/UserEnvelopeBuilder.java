/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;

public class UserEnvelopeBuilder {
    //the instance to build
    private UserEnvelope userEnvelope;

    /**
     * Default constructor to initialize the instance
     */
    public UserEnvelopeBuilder() {
        userEnvelope = new UserEnvelope();
    }

    /**
     * User Information
     */
    public UserEnvelopeBuilder data(User data) {
        userEnvelope.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UserEnvelope build() {
        return userEnvelope;
    }
}