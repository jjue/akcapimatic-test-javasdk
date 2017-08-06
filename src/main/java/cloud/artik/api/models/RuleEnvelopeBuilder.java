/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;

public class RuleEnvelopeBuilder {
    //the instance to build
    private RuleEnvelope ruleEnvelope;

    /**
     * Default constructor to initialize the instance
     */
    public RuleEnvelopeBuilder() {
        ruleEnvelope = new RuleEnvelope();
    }

    /**
     * Rule information.
     */
    public RuleEnvelopeBuilder data(OutputRule data) {
        ruleEnvelope.setData(data);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public RuleEnvelope build() {
        return ruleEnvelope;
    }
}