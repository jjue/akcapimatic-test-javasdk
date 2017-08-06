/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ValidationCallbackInfo 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4647297440057322629L;
    private String aid;
    private String nonce;
    /** GETTER
     * Application id that created the subscription.
     */
    @JsonGetter("aid")
    public String getAid ( ) { 
        return this.aid;
    }
    
    /** SETTER
     * Application id that created the subscription.
     */
    @JsonSetter("aid")
    public void setAid (String value) { 
        this.aid = value;
    }
 
    /** GETTER
     * Nonce obtained from the validation request.
     */
    @JsonGetter("nonce")
    public String getNonce ( ) { 
        return this.nonce;
    }
    
    /** SETTER
     * Nonce obtained from the validation request.
     */
    @JsonSetter("nonce")
    public void setNonce (String value) { 
        this.nonce = value;
    }
 
}
 