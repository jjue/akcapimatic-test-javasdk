/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;

public class TagArrayBuilder {
    //the instance to build
    private TagArray tagArray;

    /**
     * Default constructor to initialize the instance
     */
    public TagArrayBuilder() {
        tagArray = new TagArray();
    }

    public TagArrayBuilder tags(List<Tag> tags) {
        tagArray.setTags(tags);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TagArray build() {
        return tagArray;
    }
}