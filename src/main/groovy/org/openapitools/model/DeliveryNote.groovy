package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PrecedingSalesVoucherType;
import org.openapitools.model.VoucherStatus;

@Canonical
class DeliveryNote {
    
    Object address = null
    /* References the contact entity. */
    String contactId
    
    String contactName
    
    String currency
    
    Date deliveryDate
    
    String deliveryNoteNumber
    
    Object files = null
    
    String introduction
    
    Object lineItems = null
    /* References the preceding sales voucher entity. */
    String precedingSalesVoucherId
    
    PrecedingSalesVoucherType precedingSalesVoucherType
    
    String remark
    
    Date shippingDate
    
    String shippingMethod
    
    String subtotal
    
    String title
    
    String totalAmount
    
    Date voucherDate
    
    VoucherStatus voucherStatus
}
