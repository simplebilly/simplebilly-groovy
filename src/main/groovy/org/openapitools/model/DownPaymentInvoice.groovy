package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class DownPaymentInvoice {
    
    String contactId
    
    String contactName
    
    String createdAt
    
    String currency
    
    String id
    
    String notes
    
    String paidAmount
    
    String totalAmount
    
    Date voucherDate
    
    String voucherNumber
    
    String voucherStatus
}
