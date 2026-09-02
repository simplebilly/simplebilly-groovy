package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class AiWorkerConfig {
    
    Boolean autoReply
    
    Date createdAt
    
    UUID id
    
    Boolean isActive
    
    Integer maxToolCalls
    
    String model
    
    String name
    
    String provider
    
    String systemPrompt
    
    UUID tenantId
    
    List<String> triggerOn = new ArrayList<>()
    
    Date updatedAt
}
