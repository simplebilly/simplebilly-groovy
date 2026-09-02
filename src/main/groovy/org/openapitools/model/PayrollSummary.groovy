package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PayrollMonth;

@Canonical
class PayrollSummary {
    
    String firstName
    
    String hourlyGross
    
    UUID id
    
    String jobTitle
    
    String lastName
    
    String monthlySalary
    
    List<PayrollMonth> months = new ArrayList<>()
    
    String weeklyHours
    
    Integer year
}
