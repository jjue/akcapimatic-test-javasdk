/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;

public class MessageBuilder {
    //the instance to build
    private Message message;

    /**
     * Default constructor to initialize the instance
     */
    public MessageBuilder() {
        message = new Message();
    }

    public MessageBuilder data(LinkedHashMap<String, Object> data) {
        message.setData(data);
        return this;
    }

    /**
     * Source Device ID.
     */
    public MessageBuilder sdid(String sdid) {
        message.setSdid(sdid);
        return this;
    }

    /**
     * Timestamp (past, present or future). Defaults to current time if not provided.
     */
    public MessageBuilder ts(Long ts) {
        message.setTs(ts);
        return this;
    }

    /**
     * Type - message.
     */
    public MessageBuilder type(String type) {
        message.setType(type);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Message build() {
        return message;
    }
}