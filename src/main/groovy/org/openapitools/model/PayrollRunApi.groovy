package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PayrollEntryApi;
import org.openapitools.model.PayrollRunStatus;

@Canonical
class PayrollRunApi {
    
    Date approvedAt
    
    UUID approvedBy
    
    Date createdAt
    
    List<PayrollEntryApi> entries = new ArrayList<>()
    
    Integer month
    
    Date paymentDate
    
    String periodLabel
    
    UUID runId
    
    PayrollRunStatus status
    
    UUID tenantId
    
    Integer totalEmployeeCount
    
    String totalEmployerCost
    
    String totalGross
    
    String totalNet
    
    String totalSocialSecurity
    
    String totalTaxes
    
    Date updatedAt
    
    Integer year
}
