package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class WarehouseStock {
    /* Batch/lot number (Chargennummer) — `None` for non-batched goods. */
    String batchNumber
    
    String binLocation
    /* Expiry date for batch-tracked goods. */
    Date expiryDate
    
    UUID productId
    
    Long quantity
    /* JSON array of serial numbers (Seriennummern) in this stock row. */
    Object serialNumbers = null
    
    String warehouseId
}
