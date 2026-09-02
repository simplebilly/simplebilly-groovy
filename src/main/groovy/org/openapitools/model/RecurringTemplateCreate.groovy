package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ExecutionStatus;
import org.openapitools.model.RecurringTemplateType;

@Canonical
class RecurringTemplateCreate {
    
    Date endDate
    
    String executionInterval
    
    ExecutionStatus executionStatus
    
    Boolean finalize
    
    Date lastExecutedAt
    
    String name
    
    Date nextExecutionAt
    
    Date startDate
    
    RecurringTemplateType templateType
    
    Object voucherData = null
}
