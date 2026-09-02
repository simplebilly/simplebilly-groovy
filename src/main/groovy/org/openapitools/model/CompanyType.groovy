package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum CompanyType {

    GMBH("gmbh"),
    
    UG("ug"),
    
    EINZELHAENDLER("einzelhaendler"),
    
    FREIBERUFLER("freiberufler"),
    
    AG("ag"),
    
    GBR("gbr")

    private final String value

    CompanyType(String value) {
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
