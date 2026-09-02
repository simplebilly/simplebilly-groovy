package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum SyncStatus {

    PENDING("pending"),
    
    CONNECTED("connected"),
    
    SUCCESS("success"),
    
    ERROR("error")

    private final String value

    SyncStatus(String value) {
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
