package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class PublicReturnStatusResponse {
    
    Date createdAt
    
    Object items = null
    
    String notes
    
    String orderNumber
    
    String returnNumber
    
    String returnOrderId
    
    String status
    
    Date updatedAt
}
