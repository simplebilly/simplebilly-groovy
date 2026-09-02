package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.InventoryCountStatus;

@Canonical
class InventoryCountCreate {
    
    Date countDate
    
    String countNumber
    /* JSON array of `{product_id, name, sku, expected_quantity, counted_quantity, bin_location?, batch_number?, variance}`. */
    Object lineItems = null
    
    String notes
    /* One of: draft | counting | reviewed | posted */
    InventoryCountStatus status
    /* References the warehouse entity. */
    String warehouseId
}
