package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CountryCode;
import org.openapitools.model.EmployeeStatus;
import org.openapitools.model.Gender;

@Canonical
class Employee {
    
    String address
    /* References another employee who covers when this employee is absent. */
    UUID backupEmployeeId
    
    String bic
    
    String city
    
    CountryCode country
    
    Date createdAt
    
    Date dateOfBirth
    
    Date deletedAt
    /* References the department entity. */
    UUID departmentId
    
    String email
    
    String firstName
    /* Gender for pay-transparency reporting: \"male\", \"female\" or \"diverse\". */
    Gender gender
    
    Date hireDate
    /* Hourly cost rate in EUR for labor-cost reporting; when unset the rate is derived from `monthly_salary / (weekly_hours * 4.33)`. */
    String hourlyCost
    
    String iban
    
    UUID id
    
    String jobTitle
    
    Date lastLogin
    
    String lastName
    
    Date lastUpdated
    /* Gross monthly salary in EUR for pay-transparency reporting. */
    String monthlySalary
    
    String phone
    
    String state
    
    EmployeeStatus status
    
    UUID tenantId
    
    Date updatedAt
    /* References the user entity. */
    UUID userId
    /* Contractual weekly working hours for pay-transparency normalization. */
    String weeklyHours
    
    String zip
}
