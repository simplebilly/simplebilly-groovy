package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LanguageCode;
import org.openapitools.model.OrderStatus;
import org.openapitools.model.PaymentMethod;

@Canonical
class OrderUpdate {
    
    Object auditLog = null
    
    String currency
    /* References the customer entity. */
    String customerId
    
    String externalReference
    
    Object invoiceAddress = null
    
    Object items = null
    
    LanguageCode language
    
    OrderStatus orderStatus
    
    PaymentMethod paymentMethod
    
    Object shippingAddress = null
    
    String shippingCost
    
    String shippingMethod
    
    String shippingWeight
    
    List<String> tags
    
    String totalCost
}
