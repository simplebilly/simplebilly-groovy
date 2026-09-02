package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.BoxFit;
import org.openapitools.model.MethodSuitability;

@Canonical
class SuitabilityResult {
    
    List<MethodSuitability> methods = new ArrayList<>()
    
    BoxFit recommendedBox
    
    Boolean requiresInsurance
    
    String totalValue
    
    Double totalWeightKg
}
