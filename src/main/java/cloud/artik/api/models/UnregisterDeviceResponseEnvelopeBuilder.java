/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;

public class UnregisterDeviceResponseEnvelopeBuilder {
    //the instance to build
    private UnregisterDeviceResponseEnvelope unregisterDeviceResponseEnvelope;

    /**
     * Default constructor to initialize the instance
     */
    public UnregisterDeviceResponseEnvelopeBuilder() {
        unregisterDeviceResponseEnvelope = new UnregisterDeviceResponseEnvelope();
    }

    public UnregisterDeviceResponseEnvelopeBuilder data(UnregisterDeviceResponse data) {
        unregisterDeviceResponseEnvelope.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public UnregisterDeviceResponseEnvelope build() {
        return unregisterDeviceResponseEnvelope;
    }
}