package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ReturnOrderStatus;

@Canonical
class ReturnOrder {
    /* References the contact entity. */
    String customerContactId
    
    String customerName
    /* JSON array of `{product_id, name, quantity, condition, restock, batch_number?}`. */
    Object lineItems = null
    
    String notes
    /* References the order entity. */
    String orderId
    
    String orderNumber
    
    String returnNumber
    
    String returnReason
    /* One of: requested | received | inspected | restocked | closed */
    ReturnOrderStatus status
    /* Warehouse into which restockable items are returned. References the warehouse entity. */
    String warehouseId
}
