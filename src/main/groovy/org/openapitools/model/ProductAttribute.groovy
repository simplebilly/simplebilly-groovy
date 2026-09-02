package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class ProductAttribute {
    /* Whether this attribute participates in the shop's faceted filters. */
    Boolean isFilterable
    /* Attribute name, e.g. `Material`, `Farbe`, `Gewicht`. */
    String name
    /* Ordering position within the product's attribute list. */
    Integer position
    /* The product this attribute belongs to. References the product entity. */
    UUID productId
    /* Optional unit of measure for numeric attributes, e.g. `g`, `cm`. */
    String unit
    /* Attribute value, e.g. `Baumwolle`, `Rot`, `180g`. */
    String value
}
