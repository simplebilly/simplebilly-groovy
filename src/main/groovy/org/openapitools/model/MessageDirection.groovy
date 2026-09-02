package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum MessageDirection {

    INBOUND("inbound"),
    
    OUTBOUND("outbound"),
    
    INTERNAL("internal")

    private final String value

    MessageDirection(String value) {
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
