package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ServiceAssignmentStatus;

@Canonical
class ServiceAssignmentUpdate {
    /* References the employees entity. */
    UUID employeeId
    /* References the service_jobs entity. */
    UUID jobId
    
    String notes
    /* Work day the assignment is scheduled for. */
    Date scheduledDate
    /* Planned end time of the assignment. */
    String scheduledEnd
    /* Planned start time of the assignment. */
    String scheduledStart
    /* Assignment lifecycle status: \"planned\", \"confirmed\", \"en_route\", \"in_progress\", \"completed\" or \"cancelled\". */
    ServiceAssignmentStatus status
}
