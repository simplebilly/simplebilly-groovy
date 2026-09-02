package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CheckStatus;

@Canonical
class PlausibilitySummary {
    
    Integer errors
    
    CheckStatus overallStatus
    
    Integer passed
    
    Integer totalChecks
    
    Integer warnings
}
