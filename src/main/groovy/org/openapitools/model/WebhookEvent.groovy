package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.WebhookDirection;
import org.openapitools.model.WebhookEventStatus;

@Canonical
class WebhookEvent {
    
    Integer attempts
    /* source for inbound, target URL for outbound. */
    String channel
    /* inbound | outbound */
    WebhookDirection direction
    
    String eventType
    
    String lastError
    
    Object payload = null
    /* accepted | delivered | failed */
    WebhookEventStatus status
}
