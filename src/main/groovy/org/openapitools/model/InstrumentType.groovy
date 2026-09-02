package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum InstrumentType {

    TYPISCH("typisch"),
    
    ATYPISCH("atypisch")

    private final String value

    InstrumentType(String value) {
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
