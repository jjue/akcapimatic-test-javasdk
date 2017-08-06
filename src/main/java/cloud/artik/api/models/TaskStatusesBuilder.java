/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;

public class TaskStatusesBuilder {
    //the instance to build
    private TaskStatuses taskStatuses;

    /**
     * Default constructor to initialize the instance
     */
    public TaskStatusesBuilder() {
        taskStatuses = new TaskStatuses();
    }

    /**
     * Filter
     */
    public TaskStatusesBuilder filter(String filter) {
        taskStatuses.setFilter(filter);
        return this;
    }

    /**
     * Task type
     */
    public TaskStatusesBuilder taskType(String taskType) {
        taskStatuses.setTaskType(taskType);
        return this;
    }

    /**
     * Modified on
     */
    public TaskStatusesBuilder modifiedOn(Long modifiedOn) {
        taskStatuses.setModifiedOn(modifiedOn);
        return this;
    }

    /**
     * Device Type ID
     */
    public TaskStatusesBuilder dtid(String dtid) {
        taskStatuses.setDtid(dtid);
        return this;
    }

    /**
     * Status counts
     */
    public TaskStatusesBuilder statusCounts(TaskStatusCounts statusCounts) {
        taskStatuses.setStatusCounts(statusCounts);
        return this;
    }

    /**
     * Property
     */
    public TaskStatusesBuilder property(String property) {
        taskStatuses.setProperty(property);
        return this;
    }

    /**
     * Statuses
     */
    public TaskStatusesBuilder statuses(List<TaskStatus> statuses) {
        taskStatuses.setStatuses(statuses);
        return this;
    }

    /**
     * Task ID
     */
    public TaskStatusesBuilder id(String id) {
        taskStatuses.setId(id);
        return this;
    }

    /**
     * Device IDs
     */
    public TaskStatusesBuilder dids(List<String> dids) {
        taskStatuses.setDids(dids);
        return this;
    }

    /**
     * Task parameters
     */
    public TaskStatusesBuilder taskParameters(TaskParameters taskParameters) {
        taskStatuses.setTaskParameters(taskParameters);
        return this;
    }

    /**
     * Created on
     */
    public TaskStatusesBuilder createdOn(Long createdOn) {
        taskStatuses.setCreatedOn(createdOn);
        return this;
    }

    /**
     * Status
     */
    public TaskStatusesBuilder status(String status) {
        taskStatuses.setStatus(status);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public TaskStatuses build() {
        return taskStatuses;
    }
}