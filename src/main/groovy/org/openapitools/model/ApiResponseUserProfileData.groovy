package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

@Canonical
class ApiResponseUserProfileData {
    
    Date createdAt
    
    String email
    
    Boolean emailVerified
    
    String firstName
    
    String fullName
    
    UUID id
    
    String lastName
}
