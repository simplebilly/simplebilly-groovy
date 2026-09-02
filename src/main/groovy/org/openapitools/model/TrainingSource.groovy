package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum TrainingSource {

    BUILTIN("builtin"),
    
    PLUGIN("plugin")

    private final String value

    TrainingSource(String value) {
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
