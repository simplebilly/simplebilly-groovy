package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PublicDeliveryAppointmentResponse {
    
    String appointmentId
    /* Carries the status-check token (email is out of scope for now). */
    String confirmationHint
    
    String message
    
    String status
}
