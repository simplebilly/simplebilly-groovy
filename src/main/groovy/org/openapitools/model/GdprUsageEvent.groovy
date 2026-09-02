package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

@Canonical
class GdprUsageEvent {
    
    Date createdAt
    
    String eventType
    
    UUID id
    
    Integer quantity
    
    UUID tenantId
}
