package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ReturnOrderStatus {

    REQUESTED("requested"),
    
    RECEIVED("received"),
    
    INSPECTED("inspected"),
    
    RESTOCKED("restocked"),
    
    CLOSED("closed")

    private final String value

    ReturnOrderStatus(String value) {
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
