package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class EventSubscription {
    
    String callbackUrl
    
    String eventType
    
    Boolean isActive
    
    String subscriptionId
}
