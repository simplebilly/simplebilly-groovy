package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class CostingLine {
    /* total_quantity × unit_purchase_price (0 when price unknown). */
    String lineCost
    
    String name
    
    UUID productId
    /* Component quantity required per finished unit. */
    Long quantityPerUnit
    
    String sku
    /* Total component quantity consumed by this order. */
    Long totalQuantity
    
    String unitPurchasePrice
}
