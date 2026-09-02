package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum VoucherStatus {

    OPEN("open"),
    
    PAID("paid"),
    
    INVOICED("invoiced")

    private final String value

    VoucherStatus(String value) {
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
