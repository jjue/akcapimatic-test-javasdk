/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class Token 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5125779957857913089L;
    private String accessToken;
    private Long expiresIn;
    private String scope;
    private String tokenType;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("access_token")
    public String getAccessToken ( ) { 
        return this.accessToken;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("access_token")
    public void setAccessToken (String value) { 
        this.accessToken = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("expires_in")
    public Long getExpiresIn ( ) { 
        return this.expiresIn;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("expires_in")
    public void setExpiresIn (Long value) { 
        this.expiresIn = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("scope")
    public String getScope ( ) { 
        return this.scope;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("scope")
    public void setScope (String value) { 
        this.scope = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("token_type")
    public String getTokenType ( ) { 
        return this.tokenType;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("token_type")
    public void setTokenType (String value) { 
        this.tokenType = value;
    }
 
}
 