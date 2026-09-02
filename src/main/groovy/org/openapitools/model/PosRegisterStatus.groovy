package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PosRegisterStatus {

    ACTIVE("active"),
    
    DISABLED("disabled")

    private final String value

    PosRegisterStatus(String value) {
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
