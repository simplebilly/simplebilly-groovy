package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class NotificationDto {
    
    Date createdAt
    
    UUID id
    
    Boolean isRead
    
    String message
    
    Boolean sentViaEmail
    
    UUID tenantId
    
    String title
    
    UUID userId
}
