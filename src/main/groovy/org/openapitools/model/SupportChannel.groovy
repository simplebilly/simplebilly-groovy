package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SupportChannelType;

@Canonical
class SupportChannel {
    
    SupportChannelType channelType
    
    Object config = null
    
    Date createdAt
    
    Boolean isActive
    
    String name
    
    UUID tenantId
    
    Date updatedAt
}
