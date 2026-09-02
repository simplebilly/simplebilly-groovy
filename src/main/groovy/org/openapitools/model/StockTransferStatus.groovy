package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum StockTransferStatus {

    DRAFT("draft"),
    
    COMPLETED("completed"),
    
    CANCELLED("cancelled")

    private final String value

    StockTransferStatus(String value) {
        this.value = value
    }

    String getValue() {
        value
    }

    @Override
    String toString() {
        String.valueOf(value)
    }
}
