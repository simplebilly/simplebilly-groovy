package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PurchaseOrderStatus {

    DRAFT("draft"),
    
    ORDERED("ordered"),
    
    PARTIALLY_RECEIVED("partially_received"),
    
    RECEIVED("received"),
    
    CANCELLED("cancelled")

    private final String value

    PurchaseOrderStatus(String value) {
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
