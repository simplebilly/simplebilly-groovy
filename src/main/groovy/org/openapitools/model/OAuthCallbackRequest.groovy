package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class OAuthCallbackRequest {
    
    String code
    
    Object config = null
    
    String connectionId
    
    String platform
    
    String shopDomain
    
    String state
}
