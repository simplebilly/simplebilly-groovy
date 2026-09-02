package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class Automation {
    
    String automationKey
    
    Object config = null
    
    Date createdAt
    
    Boolean enabled
    
    Date lastRunAt
    
    Date nextRunAt
    
    UUID tenantId
    
    Date updatedAt
}
