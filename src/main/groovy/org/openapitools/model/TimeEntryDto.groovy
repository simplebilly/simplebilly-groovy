package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class TimeEntryDto {
    
    Date clockIn
    
    Date clockOut
    
    Date createdAt
    
    Date date
    
    UUID employeeId
    
    String hours
    
    String notes
    
    UUID timeEntryId
}
