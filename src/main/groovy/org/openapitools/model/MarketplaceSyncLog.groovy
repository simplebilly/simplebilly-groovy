package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SyncLogStatus;
import org.openapitools.model.SyncType;

@Canonical
class MarketplaceSyncLog {
    
    Date completedAt
    /* References the marketplace connection entity. */
    String connectionId
    
    String errorMessage
    
    Integer itemsFailed
    
    Integer itemsSynced
    
    String platform
    
    Date startedAt
    
    SyncLogStatus status
    
    SyncType syncType
}
