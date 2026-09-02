package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CreateSubscriptionRequest {
    
    String eventType
    
    Boolean isActive
    
    String name
    
    String secret
    
    String url
}
