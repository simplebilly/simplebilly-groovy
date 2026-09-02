package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CreateEmissionTarget {
    
    String baseValue
    
    Integer baseYear
    
    String description
    
    String scope
    
    String targetValue
    
    Integer targetYear
}
