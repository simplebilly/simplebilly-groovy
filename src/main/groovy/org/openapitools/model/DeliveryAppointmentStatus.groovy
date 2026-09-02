package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;

enum DeliveryAppointmentStatus {

    REQUESTED("requested"),
    
    CONFIRMED("confirmed"),
    
    ARRIVED("arrived"),
    
    CANCELLED("cancelled"),
    
    COMPLETED("completed")

    private final String value

    DeliveryAppointmentStatus(String value) {
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
