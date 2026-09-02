package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum DocumentType {

    INVOICE("invoice"),
    
    CREDITNOTE("creditnote"),
    
    ADVANCEPAYMENT("advancepayment"),
    
    DOWNPAYMENTINVOICE("downpaymentinvoice"),
    
    DELIVERYNOTE("deliverynote"),
    
    ORDERCONFIRMATION("orderconfirmation"),
    
    QUOTATION("quotation"),
    
    PROFORMAINVOICE("proformainvoice")

    private final String value

    DocumentType(String value) {
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
