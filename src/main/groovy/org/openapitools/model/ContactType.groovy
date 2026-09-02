package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ContactType {

    CUSTOMER("customer"),
    
    SUPPLIER("supplier")

    private final String value

    ContactType(String value) {
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
