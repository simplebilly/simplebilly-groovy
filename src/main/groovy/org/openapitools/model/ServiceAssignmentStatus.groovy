package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ServiceAssignmentStatus {

    PLANNED("planned"),
    
    CONFIRMED("confirmed"),
    
    EN_ROUTE("en_route"),
    
    IN_PROGRESS("in_progress"),
    
    COMPLETED("completed"),
    
    CANCELLED("cancelled")

    private final String value

    ServiceAssignmentStatus(String value) {
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
