/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class SubscriptionsEnvelope 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4893364282286672182L;
    private Long total;
    private Integer offset;
    private SubscriptionArray data;
    private Integer count;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("total")
    public Long getTotal ( ) { 
        return this.total;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("total")
    public void setTotal (Long value) { 
        this.total = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("offset")
    public Integer getOffset ( ) { 
        return this.offset;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("offset")
    public void setOffset (Integer value) { 
        this.offset = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("data")
    public SubscriptionArray getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("data")
    public void setData (SubscriptionArray value) { 
        this.data = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("count")
    public Integer getCount ( ) { 
        return this.count;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("count")
    public void setCount (Integer value) { 
        this.count = value;
    }
 
}
 