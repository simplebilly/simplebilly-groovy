package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class PrintLabelResponse {
    
    String labelUrl
    
    String message
    
    String sscc
    
    Boolean success
    
    String trackingNumber
}
