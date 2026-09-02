package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class ProductVariantCreate {
    
    String barcode
    
    String imageLink
    
    Boolean isActive
    /* Human-readable variant label, e.g. \"Red / M\". */
    String name
    /* Option name → value map, e.g. `{\"Color\": \"Red\", \"Size\": \"M\"}`. */
    Object optionValues = null
    /* Explicit override price for this variant (takes precedence over parent price + delta). */
    String price
    /* Price adjustment relative to the parent product's `default_price`. */
    String priceDelta
    /* The parent product this variant belongs to. References the product entity. */
    UUID productId
    /* Variant-specific SKU (must be unique per tenant). */
    String sku
    /* Variant-level stock (optional — may be tracked on the parent only). */
    Long stockQuantity
}
