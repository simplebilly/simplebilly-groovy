package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ApiResponseUserProfileData;

@Canonical
class ApiResponseUserProfile {
    
    ApiResponseUserProfileData data
    
    String error
    
    String message
    
    Boolean success
}
