/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;

public class WebSocketErrorBuilder {
    //the instance to build
    private WebSocketError webSocketError;

    /**
     * Default constructor to initialize the instance
     */
    public WebSocketErrorBuilder() {
        webSocketError = new WebSocketError();
    }

    /**
     * Message.
     */
    public WebSocketErrorBuilder message(String message) {
        webSocketError.setMessage(message);
        return this;
    }

    /**
     * Code
     */
    public WebSocketErrorBuilder code(Integer code) {
        webSocketError.setCode(code);
        return this;
    }

    /**
     * Confirmation ID
     */
    public WebSocketErrorBuilder cid(String cid) {
        webSocketError.setCid(cid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public WebSocketError build() {
        return webSocketError;
    }
}