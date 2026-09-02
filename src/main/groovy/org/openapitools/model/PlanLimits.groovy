package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

@Canonical
class PlanLimits {
    
    Integer maxConnectors
    
    Long maxInvoicesPerMonth
    
    Integer maxUsers
    
    Map<String, Long> metered = new HashMap<>()
    /* Connectors that are *not* included in this plan (require a higher tier). Empty = all connectors included on this plan. */
    List<String> paidConnectors = new ArrayList<>()
}
