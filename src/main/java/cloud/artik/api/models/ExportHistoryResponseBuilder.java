/*
 * ARTIKCloudAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package cloud.artik.api.models;

import java.util.*;

public class ExportHistoryResponseBuilder {
    //the instance to build
    private ExportHistoryResponse exportHistoryResponse;

    /**
     * Default constructor to initialize the instance
     */
    public ExportHistoryResponseBuilder() {
        exportHistoryResponse = new ExportHistoryResponse();
    }

    public ExportHistoryResponseBuilder count(Long count) {
        exportHistoryResponse.setCount(count);
        return this;
    }

    /**
     * Export Data Array.
     */
    public ExportHistoryResponseBuilder data(ExportDataArray data) {
        exportHistoryResponse.setData(data);
        return this;
    }

    public ExportHistoryResponseBuilder offset(Long offset) {
        exportHistoryResponse.setOffset(offset);
        return this;
    }

    public ExportHistoryResponseBuilder total(Long total) {
        exportHistoryResponse.setTotal(total);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ExportHistoryResponse build() {
        return exportHistoryResponse;
    }
}