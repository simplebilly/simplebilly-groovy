package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.LeadStatus;

@Canonical
class Lead {
    
    String company
    
    Date convertedAt
    
    Date createdAt
    
    String email
    
    Date firstContactAt
    
    String name
    
    String notes
    
    String phone
    
    Integer score
    
    String source
    
    LeadStatus status
    
    Object tags = null
    
    UUID tenantId
    
    Date updatedAt
}
