package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum BomStatus {

    DRAFT("draft"),
    
    ACTIVE("active"),
    
    ARCHIVED("archived")

    private final String value

    BomStatus(String value) {
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
