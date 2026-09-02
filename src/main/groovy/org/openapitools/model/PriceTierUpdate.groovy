package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class PriceTierUpdate {
    /* None = tier applies to all customers; otherwise a customer group id. */
    String customerGroupId
    /* Quantity from which this tier applies (inclusive). */
    Long minQuantity
    /* References the product entity. */
    UUID productId
    /* Net unit price once `min_quantity` is reached. */
    String unitPrice
}
