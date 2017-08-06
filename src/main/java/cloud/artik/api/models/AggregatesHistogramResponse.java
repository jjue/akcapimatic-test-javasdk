/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class AggregatesHistogramResponse 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5154997555842978363L;
    private List<AggregatesHistogramData> data;
    private Long endDate;
    private String field;
    private String interval;
    private String sdid;
    private Long size;
    private Long startDate;
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("data")
    public List<AggregatesHistogramData> getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("data")
    public void setData (List<AggregatesHistogramData> value) { 
        this.data = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("endDate")
    public Long getEndDate ( ) { 
        return this.endDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("endDate")
    public void setEndDate (Long value) { 
        this.endDate = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("field")
    public String getField ( ) { 
        return this.field;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("field")
    public void setField (String value) { 
        this.field = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("interval")
    public String getInterval ( ) { 
        return this.interval;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("interval")
    public void setInterval (String value) { 
        this.interval = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("sdid")
    public String getSdid ( ) { 
        return this.sdid;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("sdid")
    public void setSdid (String value) { 
        this.sdid = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("size")
    public Long getSize ( ) { 
        return this.size;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("size")
    public void setSize (Long value) { 
        this.size = value;
    }
 
    /** GETTER
     * TODO: Write general description for this method
     */
    @JsonGetter("startDate")
    public Long getStartDate ( ) { 
        return this.startDate;
    }
    
    /** SETTER
     * TODO: Write general description for this method
     */
    @JsonSetter("startDate")
    public void setStartDate (Long value) { 
        this.startDate = value;
    }
 
}
 