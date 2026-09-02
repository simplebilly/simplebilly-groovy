package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ExecutionStatus {

    ACTIVE("ACTIVE"),
    
    PAUSED("PAUSED"),
    
    COMPLETED("COMPLETED")

    private final String value

    ExecutionStatus(String value) {
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
