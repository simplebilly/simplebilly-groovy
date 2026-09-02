package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EmissionTargetScope;

@Canonical
class EmissionTarget {
    
    String baseValue
    /* tCO2e in the base year (actuals). */
    Integer baseYear
    /* Transition-plan narrative (ESRS E1-1 light), may be empty. */
    String description
    /* \"total\" | \"1\" | \"2\" | \"3\". */
    EmissionTargetScope scope
    
    String targetValue
    /* tCO2e target for the target year. */
    Integer targetYear
    
    Date updatedAt
}
