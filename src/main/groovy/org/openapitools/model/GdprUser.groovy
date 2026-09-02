package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

@Canonical
class GdprUser {
    
    Date createdAt
    
    String email
    
    UUID id
    
    String name
}
