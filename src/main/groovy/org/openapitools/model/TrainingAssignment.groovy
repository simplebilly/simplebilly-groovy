package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssignmentStatus;

@Canonical
class TrainingAssignment {
    
    UUID assignedBy
    
    Date createdAt
    
    Date deletedAt
    
    Date dueDate
    
    UUID employeeId
    
    UUID id
    
    String notes
    
    AssignmentStatus status
    
    UUID tenantId
    
    UUID trainingId
    
    Date updatedAt
}
