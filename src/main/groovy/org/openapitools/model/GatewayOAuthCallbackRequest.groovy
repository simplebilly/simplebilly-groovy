package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class GatewayOAuthCallbackRequest {
    
    String code
    
    String gatewayType
    
    String redirectUri
    
    String state
}
