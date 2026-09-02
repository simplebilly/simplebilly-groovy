package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum WebhookDirection {

    INBOUND("inbound"),
    
    OUTBOUND("outbound")

    private final String value

    WebhookDirection(String value) {
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
