package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CountryCode;

@Canonical
class ShippingRuleCreate {
    /* Provider that auto-filled this rule (e.g. \"ups\"), if any. */
    String carrier
    /* None = applies to all countries. */
    CountryCode country
    /* Delivery time text, e.g. \"1-3\". */
    String deliveryTime
    
    Boolean isActive
    
    Double maxWeightKg
    
    Double minWeightKg
    /* Delivery-method label, e.g. \"Standardversand\". */
    String name
    
    String notes
    /* Shipping cost in the shop's currency. */
    String price
    /* Lower wins when multiple rules match. */
    Integer priority
}
