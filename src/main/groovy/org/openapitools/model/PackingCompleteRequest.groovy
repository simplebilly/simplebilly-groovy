package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class PackingCompleteRequest {
    
    String notes
    
    String orderNumber
    
    String shipmentId
    
    String videoUrl
}
