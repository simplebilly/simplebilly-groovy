package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum EmployeeStatus {

    ACTIVE("active"),
    
    INACTIVE("inactive"),
    
    TERMINATED("terminated")

    private final String value

    EmployeeStatus(String value) {
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
