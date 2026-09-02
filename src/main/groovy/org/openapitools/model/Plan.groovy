package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PlanFeatures;
import org.openapitools.model.PlanLimits;

@Canonical
class Plan {
    
    PlanFeatures features
    
    String id
    
    PlanLimits limits
    
    String name
    
    Double priceEur
}
