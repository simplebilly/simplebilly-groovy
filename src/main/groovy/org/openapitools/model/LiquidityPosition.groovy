package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class LiquidityPosition {
    
    Double accountsPayable
    
    Double accountsReceivable
    
    Double cashAndEquivalents
    
    Double currentRatio
    
    Double quickRatio
    
    Double workingCapital
}
