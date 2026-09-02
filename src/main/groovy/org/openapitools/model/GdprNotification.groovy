package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class GdprNotification {
    
    Date createdAt
    
    UUID id
    
    Boolean isRead
    
    String message
    
    UUID tenantId
    
    String title
}
