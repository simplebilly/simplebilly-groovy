package org.openapitools.model;

import groovy.transform.Canonical

enum AssignmentStatus {

    REQUIRED("required"),
    
    COMPLETED("completed"),
    
    OVERDUE("overdue"),
    
    WAIVED("waived")

    private final String value

    AssignmentStatus(String value) {
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
