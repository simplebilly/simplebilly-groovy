package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class EmissionFactorResponse {
    
    String categoryId
    
    Double kgCo2ePerUnit
    
    String nameDe
    
    String source
    
    String unit
    
    String version
}
