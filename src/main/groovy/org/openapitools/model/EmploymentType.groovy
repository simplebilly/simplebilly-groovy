package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum EmploymentType {

    FULLTIME("fulltime"),
    
    PARTTIME("parttime"),
    
    CONTRACT("contract"),
    
    INTERNSHIP("internship"),
    
    TEMPORARY("temporary")

    private final String value

    EmploymentType(String value) {
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
