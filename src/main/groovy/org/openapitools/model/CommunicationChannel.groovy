package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CommunicationChannel {

    EMAIL("email"),
    
    CALL("call"),
    
    MEETING("meeting"),
    
    CHAT("chat"),
    
    NOTE("note")

    private final String value

    CommunicationChannel(String value) {
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
