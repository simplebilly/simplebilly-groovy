package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum DeliveryDateStatus {

    PROMISED("promised"),
    
    CONFIRMED("confirmed"),
    
    RESCHEDULED("rescheduled"),
    
    FULFILLED("fulfilled"),
    
    LATE("late"),
    
    CANCELLED("cancelled")

    private final String value

    DeliveryDateStatus(String value) {
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
