package org.openapitools.model;

import groovy.transform.Canonical

enum OrderStatus {

    PENDING("pending"),
    
    ORDERED("ordered"),
    
    CONFIRMED("confirmed"),
    
    PROCESSING("processing"),
    
    PAID("paid"),
    
    SHIPPED("shipped"),
    
    COMPLETED("completed"),
    
    CLOSED("closed"),
    
    CANCELLED("cancelled"),
    
    REFUNDED("refunded"),
    
    FAILED("failed")

    private final String value

    OrderStatus(String value) {
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
