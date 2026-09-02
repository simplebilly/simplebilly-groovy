package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class RecurringTemplate {
    
    String createdAt
    
    String deletedAt
    
    Date endDate
    
    String executionInterval
    
    String executionStatus
    
    Boolean finalize
    
    Date lastExecutedAt
    
    String name
    
    Date nextExecutionAt
    
    Date startDate
    
    String templateId
    
    String templateType
    
    String updatedAt
    
    Object voucherData = null
}
