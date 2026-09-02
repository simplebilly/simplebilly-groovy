package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class GenerateVariantsRequest {
    /* Option name → list of values, e.g. `{\"Color\": [\"Red\", \"Blue\"], \"Size\": [\"S\", \"M\"]}`. The cartesian product of these lists is generated. */
    Map<String, List<String>> options = new HashMap<>()
    /* Optional per-variant price delta applied to every generated variant. */
    String priceDelta
    
    UUID productId
    /* Optional prefix for the generated SKUs (suffix is the option values joined by `-`). Falls back to the parent product's SKU. */
    String skuPrefix
}
