package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MovementType;
import org.openapitools.model.ReferenceType;

@Canonical
class StockMovement {
    /* Signed movement: positive = into stock, negative = out of stock. */
    Long delta
    /* One of the `MOVEMENT_*` constants. */
    MovementType movementType
    /* References the product entity. */
    UUID productId
    /* Absolute quantity moved (always >= 0). */
    Long quantity
    
    String reason
    /* Primary-key of the referencing entity. */
    String referenceId
    /* Entity that caused the movement, e.g. `goods_receipt`, `stock_transfer`. */
    ReferenceType referenceType
    /* References the warehouse entity. */
    String warehouseId
}
