/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TokenResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5673691771970313158L;
    private Token data;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("data")
    public Token getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("data")
    public void setData (Token value) { 
        this.data = value;
    }
 
}
 