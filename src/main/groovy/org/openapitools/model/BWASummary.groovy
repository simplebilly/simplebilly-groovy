package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class BWASummary {
    
    String grossProfit
    
    String netProfit
    
    Long openInvoicesCount
    
    String openInvoicesTotal
    
    Long overdueInvoicesCount
    
    String overdueInvoicesTotal
    
    Double profitMargin
}
