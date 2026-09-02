package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class Team {
    
    Date createdAt
    
    String description
    
    UUID id
    
    String name
    
    UUID parentTeamId
    
    UUID tenantId
    
    Date updatedAt
}
