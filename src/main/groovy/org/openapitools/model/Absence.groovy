package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.AbsenceStatus;
import org.openapitools.model.AbsenceType;

@Canonical
class Absence {
    /* One of \"vacation\", \"sick\", \"sabbatical\", \"parental\", \"other\". */
    AbsenceType absenceType
    
    Date approvedAt
    /* References the user entity. */
    UUID approvedBy
    
    Date createdAt
    
    Date deletedAt
    /* References the employee entity. */
    UUID employeeId
    
    Date endDate
    
    UUID id
    
    String notes
    
    Date startDate
    /* One of \"pending\", \"approved\", \"rejected\", \"cancelled\". */
    AbsenceStatus status
    
    UUID tenantId
    
    Date updatedAt
}
