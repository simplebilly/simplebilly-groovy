package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PrecedingSalesVoucherType {

    ORDER_CONFIRMATION("order_confirmation"),
    
    QUOTATION("quotation"),
    
    PROFORMA_INVOICE("proforma_invoice")

    private final String value

    PrecedingSalesVoucherType(String value) {
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
