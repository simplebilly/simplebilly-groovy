package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum SyncType {

    ORDERS("orders"),
    
    PRODUCTS("products"),
    
    INVENTORY("inventory"),
    
    INVOICES("invoices"),
    
    SHIPMENTS("shipments"),
    
    CONTACTS("contacts"),
    
    PRICES("prices"),
    
    CONFIG("config"),
    
    BRANDING("branding"),
    
    LEGAL("legal")

    private final String value

    SyncType(String value) {
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
