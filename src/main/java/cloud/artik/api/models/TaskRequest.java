/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class TaskRequest 
        implements java.io.Serializable {
    private static final long serialVersionUID = 4823508214055093830L;
    private String filter;
    private String taskType;
    private String dtid;
    private String property;
    private List<String> dids;
    private TaskParameters taskParameters;
    /** GETTER
     * Filter
     */
    @JsonGetter("filter")
    public String getFilter ( ) { 
        return this.filter;
    }
    
    /** SETTER
     * Filter
     */
    @JsonSetter("filter")
    public void setFilter (String value) { 
        this.filter = value;
    }
 
    /** GETTER
     * Task type
     */
    @JsonGetter("taskType")
    public String getTaskType ( ) { 
        return this.taskType;
    }
    
    /** SETTER
     * Task type
     */
    @JsonSetter("taskType")
    public void setTaskType (String value) { 
        this.taskType = value;
    }
 
    /** GETTER
     * Device Type ID
     */
    @JsonGetter("dtid")
    public String getDtid ( ) { 
        return this.dtid;
    }
    
    /** SETTER
     * Device Type ID
     */
    @JsonSetter("dtid")
    public void setDtid (String value) { 
        this.dtid = value;
    }
 
    /** GETTER
     * Property
     */
    @JsonGetter("property")
    public String getProperty ( ) { 
        return this.property;
    }
    
    /** SETTER
     * Property
     */
    @JsonSetter("property")
    public void setProperty (String value) { 
        this.property = value;
    }
 
    /** GETTER
     * Device IDs
     */
    @JsonGetter("dids")
    public List<String> getDids ( ) { 
        return this.dids;
    }
    
    /** SETTER
     * Device IDs
     */
    @JsonSetter("dids")
    public void setDids (List<String> value) { 
        this.dids = value;
    }
 
    /** GETTER
     * Task parameters
     */
    @JsonGetter("taskParameters")
    public TaskParameters getTaskParameters ( ) { 
        return this.taskParameters;
    }
    
    /** SETTER
     * Task parameters
     */
    @JsonSetter("taskParameters")
    public void setTaskParameters (TaskParameters value) { 
        this.taskParameters = value;
    }
 
}
 