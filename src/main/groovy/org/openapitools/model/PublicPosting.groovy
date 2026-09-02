package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class PublicPosting {
    
    String currency
    
    String description
    
    String employmentType
    
    UUID id
    
    String location
    
    Boolean remote
    
    List<String> requiredSkills = new ArrayList<>()
    
    String requirements
    
    Integer salaryMax
    
    Integer salaryMin
    
    String title
}
