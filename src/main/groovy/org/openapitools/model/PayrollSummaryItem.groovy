package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PayrollRunStatus;

@Canonical
class PayrollSummaryItem {
    
    Integer employeeCount
    
    String month
    
    PayrollRunStatus status
    
    String totalEmployerCost
    
    String totalGross
    
    String totalNet
    
    Integer year
}
