/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;

public class SubscriptionBuilder {
    //the instance to build
    private Subscription subscription;

    /**
     * Default constructor to initialize the instance
     */
    public SubscriptionBuilder() {
        subscription = new Subscription();
    }

    /**
     * AWS region (if subscriptionType is awsKinesis
     */
    public SubscriptionBuilder awsRegion(String awsRegion) {
        subscription.setAwsRegion(awsRegion);
        return this;
    }

    /**
     * Include Shared Devices
     */
    public SubscriptionBuilder includeSharedDevices(Boolean includeSharedDevices) {
        subscription.setIncludeSharedDevices(includeSharedDevices);
        return this;
    }

    /**
     * Description
     */
    public SubscriptionBuilder description(String description) {
        subscription.setDescription(description);
        return this;
    }

    /**
     * AWS key (if subscriptionType is awsKinesis
     */
    public SubscriptionBuilder awsKey(String awsKey) {
        subscription.setAwsKey(awsKey);
        return this;
    }

    /**
     * AWS secret (if subscriptionType is awsKinesis
     */
    public SubscriptionBuilder awsSecret(String awsSecret) {
        subscription.setAwsSecret(awsSecret);
        return this;
    }

    /**
     * Creation timestamp
     */
    public SubscriptionBuilder createdOn(Long createdOn) {
        subscription.setCreatedOn(createdOn);
        return this;
    }

    /**
     * AWS Kinesis stream name (if subscriptionType is awsKinesis
     */
    public SubscriptionBuilder awsKinesisStreamName(String awsKinesisStreamName) {
        subscription.setAwsKinesisStreamName(awsKinesisStreamName);
        return this;
    }

    /**
     * User ID
     */
    public SubscriptionBuilder uid(String uid) {
        subscription.setUid(uid);
        return this;
    }

    /**
     * Message type
     */
    public SubscriptionBuilder messageType(String messageType) {
        subscription.setMessageType(messageType);
        return this;
    }

    /**
     * Destination device ID
     */
    public SubscriptionBuilder ddid(String ddid) {
        subscription.setDdid(ddid);
        return this;
    }

    /**
     * Subscription type (either httpCallback or awsKinesis, default to httpCallback)
     */
    public SubscriptionBuilder subscriptionType(String subscriptionType) {
        subscription.setSubscriptionType(subscriptionType);
        return this;
    }

    /**
     * Name
     */
    public SubscriptionBuilder name(String name) {
        subscription.setName(name);
        return this;
    }

    /**
     * Source device ID
     */
    public SubscriptionBuilder sdid(String sdid) {
        subscription.setSdid(sdid);
        return this;
    }

    /**
     * Callback URL
     */
    public SubscriptionBuilder callbackUrl(String callbackUrl) {
        subscription.setCallbackUrl(callbackUrl);
        return this;
    }

    /**
     * Subscription ID
     */
    public SubscriptionBuilder id(String id) {
        subscription.setId(id);
        return this;
    }

    /**
     * Application ID
     */
    public SubscriptionBuilder aid(String aid) {
        subscription.setAid(aid);
        return this;
    }

    /**
     * Source device type ID
     */
    public SubscriptionBuilder sdtid(String sdtid) {
        subscription.setSdtid(sdtid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public Subscription build() {
        return subscription;
    }
}