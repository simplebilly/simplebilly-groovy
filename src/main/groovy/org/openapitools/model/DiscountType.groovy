package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum DiscountType {

    PERCENTAGE("percentage"),
    
    FIXED_AMOUNT("fixed_amount")

    private final String value

    DiscountType(String value) {
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
