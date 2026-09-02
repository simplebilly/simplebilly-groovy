package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class MarketplaceWebhookEvent {
    /* References the marketplace connection entity. */
    String connectionId
    
    Object eventBody = null
    
    String eventType
    
    Object headers = null
    
    String platform
    
    Boolean processed
    
    String processingError
}
