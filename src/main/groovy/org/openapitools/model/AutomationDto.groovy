package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class AutomationDto {
    
    String automationKey
    
    Object config = null
    
    Integer defaultDay
    
    String description
    
    Boolean enabled
    
    String kind
    
    Date lastRunAt
    
    Date nextRunAt
    
    String scheduleKind
}
