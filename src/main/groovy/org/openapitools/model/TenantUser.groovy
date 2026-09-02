package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class TenantUser {
    
    String email
    
    Boolean emailVerified
    
    Boolean isActive
    
    Date joinedAt
    
    Date lastLogin
    
    String name
    
    List<String> permissions = new ArrayList<>()
    
    String role
    
    UUID userId
}
