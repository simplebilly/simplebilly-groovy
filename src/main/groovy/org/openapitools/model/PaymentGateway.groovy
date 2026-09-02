package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GatewayType;

@Canonical
class PaymentGateway {
    
    Object config = null
    
    Date createdAt
    
    Date deletedAt
    
    Boolean enabled
    
    String gatewayId
    
    GatewayType gatewayType
    
    String label
    
    UUID tenantId
    
    Date updatedAt
}
