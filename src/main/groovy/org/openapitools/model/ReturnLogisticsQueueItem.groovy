package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class ReturnLogisticsQueueItem {
    /* Days since creation, oldest first. */
    Long ageDays
    
    Date createdAt
    
    String customerName
    
    Object lineItems = null
    
    String orderNumber
    
    String returnNumber
    
    String returnOrderId
    
    String status
    
    String warehouseId
}
