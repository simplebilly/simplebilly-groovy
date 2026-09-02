package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class ResolvedPriceResponse {
    /* True when no tier matched and the product list price was used. */
    Boolean isListPrice
    /* Applied tier, if any matched. */
    String priceTierId
    
    UUID productId
    
    Long quantity
    
    String unitPrice
}
