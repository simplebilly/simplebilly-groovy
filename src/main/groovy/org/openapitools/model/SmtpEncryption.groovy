package org.openapitools.model;

import groovy.transform.Canonical

enum SmtpEncryption {

    START_TLS("StartTls"),
    
    TLS("Tls")

    private final String value

    SmtpEncryption(String value) {
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
