package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class ApplicationFilter {
    
    Integer page
    
    Integer pageSize
    
    UUID postingId
    
    String status
}
