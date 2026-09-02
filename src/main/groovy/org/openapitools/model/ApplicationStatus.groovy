package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ApplicationStatus {

    NEW("new"),
    
    REVIEWING("reviewing"),
    
    INTERVIEW("interview"),
    
    HIRED("hired"),
    
    REJECTED("rejected")

    private final String value

    ApplicationStatus(String value) {
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
