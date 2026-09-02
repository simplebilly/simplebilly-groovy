package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum DeclarationType {

    DCGK("dcgk"),
    
    UNTERNEHMENSFUEHRUNG("unternehmensfuehrung")

    private final String value

    DeclarationType(String value) {
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
