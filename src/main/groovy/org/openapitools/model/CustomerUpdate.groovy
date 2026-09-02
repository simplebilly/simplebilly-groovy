package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class CustomerUpdate {
    
    Object address = null
    
    String contactPerson
    
    String email
    
    String externalOrderNumber
    
    String name
    
    Integer paymentGracePeriodDays
    
    String phone
    
    String vatId
}
