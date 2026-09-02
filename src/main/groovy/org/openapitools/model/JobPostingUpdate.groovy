package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EmploymentType;
import org.openapitools.model.JobPostingStatus;

@Canonical
class JobPostingUpdate {
    
    String currency
    
    String department
    /* What the job is; markdown/HTML. */
    String description
    /* full_time | part_time | contract | internship | temporary */
    EmploymentType employmentType
    
    String location
    
    Boolean remote
    /* List of required skill names (JSON array of strings). */
    Object requiredSkills = null
    /* Structured profile of the required candidate (skills, experience). */
    String requirements
    
    Integer salaryMax
    
    Integer salaryMin
    /* draft | published | closed */
    JobPostingStatus status
    
    String title
}
