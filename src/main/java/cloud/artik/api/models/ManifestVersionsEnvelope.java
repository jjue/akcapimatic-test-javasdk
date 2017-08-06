/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;
import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;

public class ManifestVersionsEnvelope 
        implements java.io.Serializable {
    private static final long serialVersionUID = 5368701089882601964L;
    private ManifestVersions data;
    /** GETTER
     * Manifest Versions
     */
    @JsonGetter("data")
    public ManifestVersions getData ( ) { 
        return this.data;
    }
    
    /** SETTER
     * Manifest Versions
     */
    @JsonSetter("data")
    public void setData (ManifestVersions value) { 
        this.data = value;
    }
 
}
 