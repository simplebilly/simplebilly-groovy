package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ProductionOrderStatus;

@Canonical
class ProductionOrder {
    /* References the BOM entity. */
    UUID bomId
    /* JSON snapshot of the BOM components at creation time. */
    Object components = null
    
    Date endDate
    
    String notes
    
    String orderNumber
    /* The finished product to manufacture. References the product entity. */
    UUID productId
    /* Quantity of finished product to produce. */
    Long quantity
    /* Warehouse components are consumed from. References the warehouse entity. */
    String sourceWarehouseId
    
    Date startDate
    /* One of: planned | in_production | completed | cancelled */
    ProductionOrderStatus status
    /* Warehouse the finished product is added to. References the warehouse entity. */
    String targetWarehouseId
}
