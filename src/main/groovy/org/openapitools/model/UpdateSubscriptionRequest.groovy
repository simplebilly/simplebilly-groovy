package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class UpdateSubscriptionRequest {
    
    String eventType
    
    Boolean isActive
    
    String name
    
    String secret
    
    String url
}
