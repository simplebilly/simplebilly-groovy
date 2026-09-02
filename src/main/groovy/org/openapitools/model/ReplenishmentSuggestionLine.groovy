package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class ReplenishmentSuggestionLine {
    /* Current stock in the target warehouse. */
    Long currentStock
    
    Long maxStock
    
    Long minStock
    
    UUID productId
    
    String productName
    
    String sku
    /* Surplus available in the source warehouse (above its target). */
    Long sourceAvailable
    
    String sourceWarehouseId
    
    Long suggestedQuantity
    
    String targetWarehouseId
}
