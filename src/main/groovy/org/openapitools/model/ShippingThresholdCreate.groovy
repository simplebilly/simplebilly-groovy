package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class ShippingThresholdCreate {
    
    Boolean isActive
    /* Optional ceiling for the deliverable quantity. */
    Long maxSellable
    
    String name
    
    String notes
    /* None = applies to all products. References the product entity. */
    UUID productId
    /* Buffer of stock that must not be sold. */
    Long reserveStock
    /* None = applies to all warehouses. References the warehouse entity. */
    String warehouseId
}
