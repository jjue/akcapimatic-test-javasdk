/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;

public class DeviceRegConfirmUserResponseBuilder {
    //the instance to build
    private DeviceRegConfirmUserResponse deviceRegConfirmUserResponse;

    /**
     * Default constructor to initialize the instance
     */
    public DeviceRegConfirmUserResponseBuilder() {
        deviceRegConfirmUserResponse = new DeviceRegConfirmUserResponse();
    }

    /**
     * The registration request id.
     */
    public DeviceRegConfirmUserResponseBuilder rid(String rid) {
        deviceRegConfirmUserResponse.setRid(rid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeviceRegConfirmUserResponse build() {
        return deviceRegConfirmUserResponse;
    }
}