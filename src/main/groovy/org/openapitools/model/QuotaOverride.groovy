package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.QuotaOverrideFeatures;

@Canonical
class QuotaOverride {
    
    QuotaOverrideFeatures features
    
    Integer maxConnectors
    
    Long maxInvoicesPerMonth
    
    Integer maxUsers
    
    Map<String, Long> metered
    /* Custom plan id; unknown ids resolve to enterprise limits. */
    String plan
}
