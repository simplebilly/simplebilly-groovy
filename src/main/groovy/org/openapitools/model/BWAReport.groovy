package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.BWAExpenses;
import org.openapitools.model.BWARevenue;
import org.openapitools.model.BWASummary;

@Canonical
class BWAReport {
    
    BWAExpenses expenses
    
    String generatedAt
    
    String period
    
    BWARevenue revenue
    
    BWASummary summary
}
