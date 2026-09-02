package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum JobStatus {

    PENDING("pending"),
    
    RUNNING("running"),
    
    DONE("done"),
    
    FAILED("failed")

    private final String value

    JobStatus(String value) {
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
