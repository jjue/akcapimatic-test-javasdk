/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class FieldPresence 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5645375990413730178L;
    private long startDate;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("startDate")
    public long getStartDate ( ) { 
        return this.startDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("startDate")
    public void setStartDate (long value) { 
        this.startDate = value;
    }
 
}
 