package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class SyncLog {
    
    Date completedAt
    
    String connectionId
    
    String errorMessage
    
    Integer itemsFailed
    
    Integer itemsSynced
    
    String logId
    
    String platform
    
    Date startedAt
    
    String status
    
    String syncType
}
