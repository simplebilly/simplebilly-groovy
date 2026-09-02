package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum EmailTemplateStatus {

    ACTIVE("active"),
    
    INACTIVE("inactive")

    private final String value

    EmailTemplateStatus(String value) {
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
