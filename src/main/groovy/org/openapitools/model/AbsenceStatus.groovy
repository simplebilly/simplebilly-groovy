package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AbsenceStatus {

    PENDING("pending"),
    
    APPROVED("approved"),
    
    REJECTED("rejected"),
    
    CANCELLED("cancelled")

    private final String value

    AbsenceStatus(String value) {
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
