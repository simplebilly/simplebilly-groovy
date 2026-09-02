package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ProformaInvoiceStatus {

    DRAFT("draft"),
    
    SENT("sent"),
    
    CONVERTED("converted")

    private final String value

    ProformaInvoiceStatus(String value) {
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
