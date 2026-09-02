package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Employee;
import org.openapitools.model.PayrollRunStatus;

@Canonical
class PayrollEntryApi {
    
    String avEmployee
    
    String avEmployer
    
    String churchTaxAmount
    
    Employee employee
    
    UUID employeeId
    
    UUID entryId
    
    String extraPaymentReason
    
    String extraPayments
    
    String grossSalary
    
    String kvEmployee
    
    String kvEmployer
    
    String lohnsteuer
    
    String netSalary
    
    String notes
    
    String pvEmployee
    
    String pvEmployer
    
    UUID runId
    
    String rvEmployee
    
    String rvEmployer
    
    Integer sickDays
    
    String soli
    
    PayrollRunStatus status
    
    String totalDeductions
    
    String totalEmployerCost
    
    Integer vacationDaysUsed
}
