package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PrecedingSalesVoucherType;
import org.openapitools.model.VoucherStatus;

@Canonical
class Quotation {
    
    Object address = null
    /* References the contact entity. */
    String contactId
    
    String contactName
    
    String currency
    
    Date expirationDate
    
    Object files = null
    
    String introduction
    
    Object lineItems = null
    /* References the preceding sales voucher entity. */
    String precedingSalesVoucherId
    
    PrecedingSalesVoucherType precedingSalesVoucherType
    
    String quotationNumber
    
    String remark
    
    String subtotal
    
    String taxCondition
    
    String title
    
    String totalAmount
    
    String totalTax
    
    Date voucherDate
    
    VoucherStatus voucherStatus
}
