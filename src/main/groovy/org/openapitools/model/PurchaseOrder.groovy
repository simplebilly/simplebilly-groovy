package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PurchaseOrderStatus;

@Canonical
class PurchaseOrder {
    
    String currency
    
    Object deliveryAddress = null
    
    Date expectedDeliveryDate
    /* JSON array of `{product_id, name, quantity, unit_price_net, tax_rate, delivery_date}`. */
    Object lineItems = null
    
    String notes
    
    Date orderDate
    
    String poNumber
    /* One of: draft | ordered | partially_received | received | cancelled */
    PurchaseOrderStatus status
    /* References the supplier entity. */
    String supplierContactId
    
    String supplierName
    
    String totalGrossAmount
    
    String totalNetAmount
}
