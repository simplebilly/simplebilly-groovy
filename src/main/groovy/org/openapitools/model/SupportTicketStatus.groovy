package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum SupportTicketStatus {

    OPEN("open"),
    
    AWAITING_REPLY("awaiting_reply"),
    
    RESOLVED("resolved"),
    
    CLOSED("closed")

    private final String value

    SupportTicketStatus(String value) {
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
