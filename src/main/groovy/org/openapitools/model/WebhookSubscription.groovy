package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class WebhookSubscription {
    /* Event type to react to (e.g. \"order.created\"); \"*\" = all events. */
    String eventType
    
    Boolean isActive
    /* Human label (e.g. \"Warehouse app\"). */
    String name
    /* Shared secret for HMAC-SHA256 signature, sent as X-Signature. */
    String secret
    
    String url
}
