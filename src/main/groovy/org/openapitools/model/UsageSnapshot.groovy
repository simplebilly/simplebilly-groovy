package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class UsageSnapshot {
    
    Long connectors
    
    Long invoicesThisMonth
    
    Long overageSeats
    
    Long users
}
