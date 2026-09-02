package org.openapitools.model;

import groovy.transform.Canonical

enum Severity {

    INFO("Info"),
    
    WARNING("Warning"),
    
    CRITICAL("Critical")

    private final String value

    Severity(String value) {
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
