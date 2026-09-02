package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum EmissionTargetScope {

    TOTAL("total"),
    
    _1("1"),
    
    _2("2"),
    
    _3("3")

    private final String value

    EmissionTargetScope(String value) {
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
