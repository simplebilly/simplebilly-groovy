package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ReferenceType {

    GOODS_RECEIPT("goods_receipt"),
    
    PRODUCTION_ORDER("production_order"),
    
    TRANSFER_IN("transfer_in"),
    
    STOCK_TRANSFER("stock_transfer"),
    
    RETURN_ORDER("return_order"),
    
    INVENTORY_COUNT("inventory_count")

    private final String value

    ReferenceType(String value) {
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
