/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;

public class ActionInBuilder {
    //the instance to build
    private ActionIn actionIn;

    /**
     * Default constructor to initialize the instance
     */
    public ActionInBuilder() {
        actionIn = new ActionIn();
    }

    /**
     * Contains the array of Action Details
     */
    public ActionInBuilder data(ActionDetailsArray data) {
        actionIn.setData(data);
        return this;
    }

    /**
     * Confirmation ID.
     */
    public ActionInBuilder cid(String cid) {
        actionIn.setCid(cid);
        return this;
    }

    /**
     * Destination Device ID.
     */
    public ActionInBuilder ddid(String ddid) {
        actionIn.setDdid(ddid);
        return this;
    }

    /**
     * Source Device ID.
     */
    public ActionInBuilder sdid(String sdid) {
        actionIn.setSdid(sdid);
        return this;
    }

    /**
     * Timestamp (past, present or future). Defaults to current time if not provided.
     */
    public ActionInBuilder ts(Long ts) {
        actionIn.setTs(ts);
        return this;
    }

    /**
     * Type.
     */
    public ActionInBuilder type(String type) {
        actionIn.setType(type);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ActionIn build() {
        return actionIn;
    }
}