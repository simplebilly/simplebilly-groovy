package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class TargetProgress {
    
    Double baseValue
    
    Integer baseYear
    
    String description
    
    UUID id
    /* Current year's emissions for the scope as % of the target. None when no data. */
    Double progressPct
    
    String scope
    
    Double targetValue
    
    Integer targetYear
}
