package org.openapitools.model;

import groovy.transform.Canonical

enum PayrollRunStatus {

    DRAFT("draft"),
    
    CALCULATED("calculated"),
    
    APPROVED("approved"),
    
    PAID("paid")

    private final String value

    PayrollRunStatus(String value) {
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
