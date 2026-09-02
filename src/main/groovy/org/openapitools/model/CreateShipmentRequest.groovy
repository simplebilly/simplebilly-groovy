package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class CreateShipmentRequest {
    /* Carrier name as configured in shipping settings: `ups` or `dhl`. */
    String carrier
    
    String service
    
    Double weightKg
}
