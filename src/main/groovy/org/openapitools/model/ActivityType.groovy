package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ActivityType {

    CALL("call"),
    
    EMAIL("email"),
    
    MEETING("meeting"),
    
    TASK("task"),
    
    NOTE("note")

    private final String value

    ActivityType(String value) {
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
