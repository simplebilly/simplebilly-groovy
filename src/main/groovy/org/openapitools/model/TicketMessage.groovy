package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MessageDirection;
import org.openapitools.model.MessageType;

@Canonical
class TicketMessage {
    
    String authorEmail
    
    String authorName
    
    String body
    
    String bodyHtml
    
    UUID channelId
    
    Date createdAt
    
    MessageDirection direction
    
    String externalId
    
    Boolean isInternal
    
    MessageType messageType
    
    Object metadata = null
    
    UUID tenantId
    /* References the ticket entity. */
    UUID ticketId
}
