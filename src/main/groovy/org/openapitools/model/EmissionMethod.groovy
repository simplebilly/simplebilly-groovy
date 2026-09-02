package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum EmissionMethod {

    ACTIVITY("activity"),
    
    SPEND("spend"),
    
    SUPPLIER("supplier")

    private final String value

    EmissionMethod(String value) {
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
