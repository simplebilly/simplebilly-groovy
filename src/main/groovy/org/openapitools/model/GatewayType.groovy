package org.openapitools.model;

import groovy.transform.Canonical

enum GatewayType {

    STRIPE("stripe"),
    
    PAYPAL("paypal"),
    
    KLARNA("klarna"),
    
    SOFORT("sofort"),
    
    BANCONTACT("bancontact"),
    
    IDEAL("ideal"),
    
    BANK_TRANSFER("bank_transfer"),
    
    MOLLIE("mollie"),
    
    BITPAY("bitpay"),
    
    BRAINTREE("braintree"),
    
    ADYEN("adyen"),
    
    PADDLE("paddle"),
    
    VIVA_WALLET("viva_wallet"),
    
    REEPAY("reepay"),
    
    SUMUP("sumup"),
    
    TEST("test")

    private final String value

    GatewayType(String value) {
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
