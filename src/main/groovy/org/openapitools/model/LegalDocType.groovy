package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum LegalDocType {

    IMPRINT("imprint"),
    
    PRIVACY("privacy"),
    
    TERMS("terms"),
    
    WITHDRAWAL("withdrawal"),
    
    REFUND("refund"),
    
    SHIPPING("shipping"),
    
    GPSR("gpsr"),
    
    COOKIE_NOTICE("cookie_notice")

    private final String value

    LegalDocType(String value) {
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
