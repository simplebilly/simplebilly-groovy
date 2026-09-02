package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum JobPostingStatus {

    DRAFT("draft"),
    
    PUBLISHED("published"),
    
    CLOSED("closed")

    private final String value

    JobPostingStatus(String value) {
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
