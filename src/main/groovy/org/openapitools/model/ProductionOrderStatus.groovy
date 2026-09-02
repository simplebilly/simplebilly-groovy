package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum ProductionOrderStatus {

    PLANNED("planned"),
    
    IN_PRODUCTION("in_production"),
    
    COMPLETED("completed"),
    
    CANCELLED("cancelled")

    private final String value

    ProductionOrderStatus(String value) {
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
