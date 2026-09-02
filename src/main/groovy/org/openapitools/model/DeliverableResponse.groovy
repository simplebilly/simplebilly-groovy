package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class DeliverableResponse {
    
    Long availableStock
    
    Long deliverableQuantity
    
    Long maxSellable
    
    UUID productId
    
    Long reservedStock
    
    String warehouseId
}
