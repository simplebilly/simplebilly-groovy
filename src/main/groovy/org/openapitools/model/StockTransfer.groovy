package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.StockTransferStatus;

@Canonical
class StockTransfer {
    /* JSON array of `{product_id, name, quantity, batch_number?}`. */
    Object lineItems = null
    
    String notes
    /* References the warehouse entity. */
    String sourceWarehouseId
    /* One of: draft | completed | cancelled */
    StockTransferStatus status
    /* References the warehouse entity. */
    String targetWarehouseId
    
    Date transferDate
    
    String transferNumber
}
