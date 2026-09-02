package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AssignmentStatus;

@Canonical
class MyTrainingItem {
    
    UUID assignmentId
    
    String certificateId
    
    String code
    
    String description
    
    Date dueDate
    
    Integer lastScore
    
    Integer passScore
    
    Boolean passed
    
    AssignmentStatus status
    
    String title
    
    UUID trainingId
    
    Date validUntil
}
