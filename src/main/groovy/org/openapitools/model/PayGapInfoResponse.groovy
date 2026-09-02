package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class PayGapInfoResponse {
    
    UUID employeeId
    
    String firstName
    
    String gender
    
    Double groupMedianHourly
    
    Double groupMedianMonthly
    
    Integer groupSize
    
    String jobTitle
    
    String lastName
    
    Double overallMedianHourly
    
    Double ownHourlyGross
    
    Double ownMonthlyGross
}
