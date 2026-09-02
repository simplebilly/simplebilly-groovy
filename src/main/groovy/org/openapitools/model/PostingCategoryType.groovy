package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum PostingCategoryType {

    INCOME("income"),
    
    EXPENSE("expense")

    private final String value

    PostingCategoryType(String value) {
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
