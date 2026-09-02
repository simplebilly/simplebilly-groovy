package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GatewayType;

@Canonical
class PaymentGatewayCreate {
    
    Object config = null
    
    Date createdAt
    
    Date deletedAt
    
    Boolean enabled
    
    GatewayType gatewayType
    
    String label
    
    Date updatedAt
}
