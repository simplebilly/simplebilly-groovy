package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum InstituteType {

    KEIN("kein"),
    
    KREDITINSTITUT("kreditinstitut"),
    
    FINANZDIENSTLEISTUNGSINSTITUT("finanzdienstleistungsinstitut"),
    
    FINANZUNTERNEHMEN("finanzunternehmen"),
    
    VERSICHERUNG("versicherung")

    private final String value

    InstituteType(String value) {
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
