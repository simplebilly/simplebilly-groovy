package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum Gender {

    MALE("male"),
    
    FEMALE("female"),
    
    DIVERSE("diverse")

    private final String value

    Gender(String value) {
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
