/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class UnregisterDeviceResponseEnvelope 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4775277255716697198L;
    private UnregisterDeviceResponse data;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("data")
    public UnregisterDeviceResponse getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("data")
    public void setData (UnregisterDeviceResponse value) { 
        this.data = value;
    }
 
}
 