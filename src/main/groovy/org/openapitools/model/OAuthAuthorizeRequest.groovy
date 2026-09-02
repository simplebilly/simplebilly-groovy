package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class OAuthAuthorizeRequest {
    /* Optional platform-specific config (e.g. Shopify `shop_domain`, `api_key`, `api_secret`) needed to build the authorization URL. */
    Object config = null
    
    String platform
    
    String redirectUri
}
