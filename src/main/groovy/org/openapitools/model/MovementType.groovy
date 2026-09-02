package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum MovementType {

    GOODS_RECEIPT("goods_receipt"),
    
    GOODS_RECEIPT_REVERSAL("goods_receipt_reversal"),
    
    TRANSFER_IN("transfer_in"),
    
    TRANSFER_OUT("transfer_out"),
    
    RETURN_RESTOCK("return_restock"),
    
    PRODUCTION_CONSUMPTION("production_consumption"),
    
    PRODUCTION_COMPLETION("production_completion"),
    
    INVENTORY_ADJUSTMENT("inventory_adjustment"),
    
    SALE("sale"),
    
    OTHER("other")

    private final String value

    MovementType(String value) {
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
