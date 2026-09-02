package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum SyncLogStatus {

    RUNNING("running"),
    
    SUCCESS("success"),
    
    ERROR("error")

    private final String value

    SyncLogStatus(String value) {
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
