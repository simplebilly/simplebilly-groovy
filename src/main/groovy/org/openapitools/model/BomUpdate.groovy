package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BomStatus;

@Canonical
class BomUpdate {
    /* JSON array of `{product_id, name, quantity, unit, scrap_rate}`. */
    Object components = null
    
    String description
    
    String name
    /* Output quantity per production run (defaults to 1). */
    Long outputQuantity
    /* The finished product this BOM produces. References the product entity. */
    UUID productId
    /* One of: draft | active | archived */
    BomStatus status
}
