package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum SepaSequenceType {

    FRST("FRST"),
    
    RCUR("RCUR"),
    
    FNAL("FNAL"),
    
    OOFF("OOFF")

    private final String value

    SepaSequenceType(String value) {
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
