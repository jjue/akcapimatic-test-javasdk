/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;

public class MessageActionBuilder {
    //the instance to build
    private MessageAction messageAction;

    /**
     * Default constructor to initialize the instance
     */
    public MessageActionBuilder() {
        messageAction = new MessageAction();
    }

    public MessageActionBuilder data(LinkedHashMap<String, Object> data) {
        messageAction.setData(data);
        return this;
    }

    /**
     * Destination Device ID.
     */
    public MessageActionBuilder ddid(String ddid) {
        messageAction.setDdid(ddid);
        return this;
    }

    /**
     * Source Device ID.
     */
    public MessageActionBuilder sdid(String sdid) {
        messageAction.setSdid(sdid);
        return this;
    }

    /**
     * Timestamp (past, present or future). Defaults to current time if not provided.
     */
    public MessageActionBuilder ts(Long ts) {
        messageAction.setTs(ts);
        return this;
    }

    /**
     * Type.
     */
    public MessageActionBuilder type(String type) {
        messageAction.setType(type);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public MessageAction build() {
        return messageAction;
    }
}