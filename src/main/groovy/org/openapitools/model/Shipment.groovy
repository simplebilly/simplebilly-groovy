package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class Shipment {
    
    Date deliveredAt
    
    String labelUrl
    
    Object lineItemsShipment = null
    /* References the order entity. */
    String orderId
    
    Object recipientAddress = null
    
    Date shipmentDate
    
    String shippingCarrier
    
    String shippingCost
    
    String shippingMethod
    
    String signedBy
    
    String status
    /* Latest carrier tracking events (from the live tracking API). */
    Object trackingEvents = null
    
    String trackingNumber
    
    String trackingUrl
    
    Double weightKg
}
