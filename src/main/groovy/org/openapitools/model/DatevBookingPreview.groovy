package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class DatevBookingPreview {
    
    String accountNumber
    
    String debitCredit
    
    String documentDate
    
    String documentText
    
    String netAmount
    
    String oppositeAccount
    
    String taxAmount
    
    String taxRate
}
