package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ActivityStatus {

    OPEN("open"),
    
    DONE("done"),
    
    CANCELLED("cancelled")

    private final String value

    ActivityStatus(String value) {
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
