package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssignmentStatus;

@Canonical
class TrainingAssignmentCreate {
    
    UUID assignedBy
    
    Date dueDate
    
    UUID employeeId
    
    String notes
    
    AssignmentStatus status
    
    UUID trainingId
}
