package org.openapitools.model;

import groovy.transform.Canonical

enum ReminderLevel {

    NONE("none"),
    
    DUE("due"),
    
    LEVEL1("level1"),
    
    LEVEL2("level2"),
    
    LEVEL3("level3")

    private final String value

    ReminderLevel(String value) {
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
