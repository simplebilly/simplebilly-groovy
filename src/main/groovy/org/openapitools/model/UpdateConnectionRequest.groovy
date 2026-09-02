package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class UpdateConnectionRequest {
    
    String apiKey
    
    String apiSecret
    
    Object config = null
    
    Boolean isActive
    
    String label
    
    String shopDomain
}
