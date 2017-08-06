/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;

public class DeviceTypeBuilder {
    //the instance to build
    private DeviceType deviceType;

    /**
     * Default constructor to initialize the instance
     */
    public DeviceTypeBuilder() {
        deviceType = new DeviceType();
    }

    /**
     * Device Type ID.
     */
    public DeviceTypeBuilder id(String id) {
        deviceType.setId(id);
        return this;
    }

    /**
     * Unique Name.
     */
    public DeviceTypeBuilder uniqueName(String uniqueName) {
        deviceType.setUniqueName(uniqueName);
        return this;
    }

    /**
     * Latest Manifest version.
     */
    public DeviceTypeBuilder latestVersion(Integer latestVersion) {
        deviceType.setLatestVersion(latestVersion);
        return this;
    }

    /**
     * Last Updated Timestamp.
     */
    public DeviceTypeBuilder lastUpdated(Long lastUpdated) {
        deviceType.setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * Name.
     */
    public DeviceTypeBuilder name(String name) {
        deviceType.setName(name);
        return this;
    }

    /**
     * Description.
     */
    public DeviceTypeBuilder description(String description) {
        deviceType.setDescription(description);
        return this;
    }

    /**
     * User ID.
     */
    public DeviceTypeBuilder uid(String uid) {
        deviceType.setUid(uid);
        return this;
    }

    /**
     * Organization ID.
     */
    public DeviceTypeBuilder oid(String oid) {
        deviceType.setOid(oid);
        return this;
    }

    /**
     * Uses Cloud Connectors SDK
     */
    public DeviceTypeBuilder hasCloudConnector(Boolean hasCloudConnector) {
        deviceType.setHasCloudConnector(hasCloudConnector);
        return this;
    }

    /**
     * Approval status.
     */
    public DeviceTypeBuilder approved(Boolean approved) {
        deviceType.setApproved(approved);
        return this;
    }

    /**
     * Published status.
     */
    public DeviceTypeBuilder published(Boolean published) {
        deviceType.setPublished(published);
        return this;
    }

    /**
     * Protected status.
     */
    public DeviceTypeBuilder mprotected(Boolean mprotected) {
        deviceType.setProtected(mprotected);
        return this;
    }

    /**
     * In Store.
     */
    public DeviceTypeBuilder inStore(Boolean inStore) {
        deviceType.setInStore(inStore);
        return this;
    }

    /**
     * Does the current user own a device of this device type
     */
    public DeviceTypeBuilder ownedByCurrentUser(Boolean ownedByCurrentUser) {
        deviceType.setOwnedByCurrentUser(ownedByCurrentUser);
        return this;
    }

    /**
     * Tags
     */
    public DeviceTypeBuilder tags(List<Tag> tags) {
        deviceType.setTags(tags);
        return this;
    }

    /**
     * Require Secure Device Registration (SDR) Protocol.
     */
    public DeviceTypeBuilder rsp(Boolean rsp) {
        deviceType.setRsp(rsp);
        return this;
    }

    /**
     * Issuer Distinguished Name (Used in SDR)
     */
    public DeviceTypeBuilder issuerDn(String issuerDn) {
        deviceType.setIssuerDn(issuerDn);
        return this;
    }

    /**
     * Vendor ID. (Used in SDR)
     */
    public DeviceTypeBuilder vid(String vid) {
        deviceType.setVid(vid);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public DeviceType build() {
        return deviceType;
    }
}