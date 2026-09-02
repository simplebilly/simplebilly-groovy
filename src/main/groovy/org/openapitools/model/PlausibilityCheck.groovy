package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.CheckStatus;
import org.openapitools.model.Severity;

@Canonical
class PlausibilityCheck {
    
    String detail
    
    String id
    
    String name
    
    Severity severity
    
    CheckStatus status
}
