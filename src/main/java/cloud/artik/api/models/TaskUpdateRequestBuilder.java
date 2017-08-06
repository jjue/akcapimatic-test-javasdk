/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;

public class TaskUpdateRequestBuilder {
    //the instance to build
    private TaskUpdateRequest taskUpdateRequest;

    /**
     * Default constructor to initialize the instance
     */
    public TaskUpdateRequestBuilder() {
        taskUpdateRequest = new TaskUpdateRequest();
    }

    /**
     * Status
     */
    public TaskUpdateRequestBuilder status(String status) {
        taskUpdateRequest.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TaskUpdateRequest build() {
        return taskUpdateRequest;
    }
}