package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PaymentStatus;
import org.openapitools.model.VoucherStatus;
import org.openapitools.model.VoucherType;

@Canonical
class VoucherCreate {
    
    String categoryId
    /* References the contact entity. */
    String contactId
    
    String contactName
    
    String currency
    
    String description
    
    Object fileAttachments = null
    
    Object lineItems = null
    
    Object metadata = null
    
    String notes
    
    String openAmount
    
    Date paidDate
    
    PaymentStatus paymentStatus
    
    Object taxAmounts = null
    
    String taxCondition
    
    String totalGrossAmount
    
    String totalNetAmount
    
    Date voucherDate
    
    String voucherNumber
    
    VoucherStatus voucherStatus
    
    VoucherType voucherType
}
