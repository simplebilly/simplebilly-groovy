package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PaymentMethod;

@Canonical
class PaymentCreate {
    
    String amount
    
    Object attachment = null
    
    String currency
    /* References the customer entity. */
    String customerId
    
    String description
    
    Object metadata = null
    
    PaymentMethod method
    
    Date paymentDate
    
    String reference
}
