package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum RfqStatus {

    DRAFT("draft"),
    
    SENT("sent"),
    
    OFFER_RECEIVED("offer_received"),
    
    REJECTED("rejected"),
    
    CONVERTED("converted")

    private final String value

    RfqStatus(String value) {
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
