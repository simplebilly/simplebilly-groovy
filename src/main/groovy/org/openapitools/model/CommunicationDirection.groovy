package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CommunicationDirection {

    INBOUND("inbound"),
    
    OUTBOUND("outbound")

    private final String value

    CommunicationDirection(String value) {
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
