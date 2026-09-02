package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum InventoryCountStatus {

    DRAFT("draft"),
    
    COUNTING("counting"),
    
    REVIEWED("reviewed"),
    
    POSTED("posted")

    private final String value

    InventoryCountStatus(String value) {
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
