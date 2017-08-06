/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;

public class TaskStatusBuilder {
    //the instance to build
    private TaskStatus taskStatus;

    /**
     * Default constructor to initialize the instance
     */
    public TaskStatusBuilder() {
        taskStatus = new TaskStatus();
    }

    /**
     * Number of attempts
     */
    public TaskStatusBuilder numAttempts(Integer numAttempts) {
        taskStatus.setNumAttempts(numAttempts);
        return this;
    }

    /**
     * Error Message
     */
    public TaskStatusBuilder errorMessage(String errorMessage) {
        taskStatus.setErrorMessage(errorMessage);
        return this;
    }

    /**
     * Error Code
     */
    public TaskStatusBuilder errorCode(String errorCode) {
        taskStatus.setErrorCode(errorCode);
        return this;
    }

    /**
     * Device ID
     */
    public TaskStatusBuilder did(String did) {
        taskStatus.setDid(did);
        return this;
    }

    /**
     * Status
     */
    public TaskStatusBuilder status(String status) {
        taskStatus.setStatus(status);
        return this;
    }

    /**
     * Timestamp of most recent status change
     */
    public TaskStatusBuilder ts(Long ts) {
        taskStatus.setTs(ts);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TaskStatus build() {
        return taskStatus;
    }
}