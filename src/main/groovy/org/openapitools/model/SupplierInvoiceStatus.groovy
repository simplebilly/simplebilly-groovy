package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum SupplierInvoiceStatus {

    DRAFT("draft"),
    
    MATCHED("matched"),
    
    HAS_VARIANCES("has_variances"),
    
    POSTED("posted"),
    
    CANCELLED("cancelled")

    private final String value

    SupplierInvoiceStatus(String value) {
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
