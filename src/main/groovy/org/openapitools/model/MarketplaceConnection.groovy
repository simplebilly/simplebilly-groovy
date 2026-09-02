package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ConnectorType;

@Canonical
class MarketplaceConnection {
    
    Object config = null
    
    String connectionId
    
    ConnectorType connectorType
    
    Date createdAt
    
    Boolean isActive
    
    String label
    
    Date lastSyncAt
    
    String platform
    
    String platformUserId
    
    String scopes
    
    String shopDomain
    
    String shopName
    
    String syncStatus
    
    UUID tenantId
    
    Date updatedAt
}
