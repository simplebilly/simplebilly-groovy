package org.openapitools.model;

import groovy.transform.Canonical

enum InvoiceStatus {

    DRAFT("Draft"),
    
    SENT("Sent"),
    
    PARTIALLY_PAID("PartiallyPaid"),
    
    PAID("Paid"),
    
    OVERDUE("Overdue"),
    
    CANCELLED("Cancelled"),
    
    CREDITED("Credited"),
    
    EXPIRED("Expired"),
    
    DUNNING("Dunning"),
    
    COLLECT_DEBT("CollectDebt")

    private final String value

    InvoiceStatus(String value) {
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
