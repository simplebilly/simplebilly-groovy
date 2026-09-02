package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum WebhookEventStatus {

    ACCEPTED("accepted"),
    
    DELIVERED("delivered"),
    
    FAILED("failed"),
    
    RECEIVED("received")

    private final String value

    WebhookEventStatus(String value) {
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
