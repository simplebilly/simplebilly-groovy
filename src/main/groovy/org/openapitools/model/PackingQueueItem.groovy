package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class PackingQueueItem {
    
    String createdAt
    
    String customerId
    
    Boolean deliveryNotePrinted
    
    Object items = null
    
    Integer itemsCount
    
    Boolean labelPrinted
    
    String orderNumber
    
    String orderStatus
    
    String shipmentId
    
    Object shippingAddress = null
    
    String shippingMethod
    
    String trackingNumber
    
    String videoRecording
}
