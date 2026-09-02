package org.openapitools.model;

import groovy.transform.Canonical

enum PaymentMethod {

    BANK_TRANSFER("bank_transfer"),
    
    SEPA_DIRECT_DEBIT("sepa_direct_debit"),
    
    CASH("cash"),
    
    CREDIT_CARD("credit_card"),
    
    PAYPAL("paypal"),
    
    SUMUP("sumup"),
    
    VIVA_WALLET("viva_wallet"),
    
    REEPAY("reepay"),
    
    NONE("none")

    private final String value

    PaymentMethod(String value) {
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
