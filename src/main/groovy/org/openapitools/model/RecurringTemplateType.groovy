package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum RecurringTemplateType {

    INVOICE("invoice"),
    
    REPORT("report")

    private final String value

    RecurringTemplateType(String value) {
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
