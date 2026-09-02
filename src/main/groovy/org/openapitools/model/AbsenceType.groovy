package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum AbsenceType {

    VACATION("vacation"),
    
    SICK("sick"),
    
    SABBATICAL("sabbatical"),
    
    PARENTAL("parental"),
    
    OTHER("other")

    private final String value

    AbsenceType(String value) {
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
