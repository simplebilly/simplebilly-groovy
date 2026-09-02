package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class PackingCompleteResponse {
    
    String message
    
    String newState
    
    String orderNumber
    
    Boolean success
}
