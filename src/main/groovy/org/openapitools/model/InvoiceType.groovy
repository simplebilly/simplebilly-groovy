package org.openapitools.model;

import groovy.transform.Canonical

enum InvoiceType {

    INVOICE("Invoice"),
    
    CREDIT_NOTE("CreditNote"),
    
    ADVANCE_PAYMENT("AdvancePayment"),
    
    FINAL_SETTLEMENT("FinalSettlement"),
    
    SPECIAL_BILLING("SpecialBilling"),
    
    DOWN_PAYMENT_INVOICE("DownPaymentInvoice"),
    
    PROFORMA("Proforma"),
    
    RECURRING("Recurring"),
    
    CANCELLATION_INVOICE("CancellationInvoice")

    private final String value

    InvoiceType(String value) {
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
