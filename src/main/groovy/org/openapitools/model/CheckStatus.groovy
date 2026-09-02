package org.openapitools.model;

import groovy.transform.Canonical

enum CheckStatus {

    OK("Ok"),
    
    WARNING("Warning"),
    
    ERROR("Error")

    private final String value

    CheckStatus(String value) {
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
