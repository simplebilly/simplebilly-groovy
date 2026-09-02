package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SupportChannelType;
import org.openapitools.model.SupportTicketStatus;
import org.openapitools.model.TicketPriority;

@Canonical
class SupportTicketUpdate {
    
    UUID assignedTo
    
    UUID channelId
    
    SupportChannelType channelType
    
    Date closedAt
    
    Date createdAt
    
    String customerEmail
    /* References the customer entity. */
    String customerId
    
    String customerName
    
    String externalId
    
    Date firstMessageAt
    
    Date lastMessageAt
    /* References the lead entity. */
    UUID leadId
    
    Integer messageCount
    
    String orderRef
    
    TicketPriority priority
    
    String resolution
    
    SupportTicketStatus status
    
    String subject
    
    Object tags = null
    
    UUID tenantId
    
    Date updatedAt
}
