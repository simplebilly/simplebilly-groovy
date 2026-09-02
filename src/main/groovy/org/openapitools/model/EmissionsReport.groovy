package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CategoryTotal;
import org.openapitools.model.DataQuality;
import org.openapitools.model.ScopeTotal;
import org.openapitools.model.TargetProgress;
import org.openapitools.model.YearTotal;

@Canonical
class EmissionsReport {
    
    List<CategoryTotal> byCategory = new ArrayList<>()
    
    List<ScopeTotal> byScope = new ArrayList<>()
    
    List<YearTotal> byYear = new ArrayList<>()
    
    DataQuality dataQuality
    
    Double intensityPerEmployee
    /* tCO2e per million EUR net revenue. */
    Double intensityPerRevenueMio
    /* Sum of paid/sent/partially-paid invoices (EUR net) in the year. */
    Double netRevenue
    /* Spend-based estimate from bookkeeping payments (EXIOBASE factor). */
    Double spendBasedEstimateTco2e
    
    List<TargetProgress> targets = new ArrayList<>()
    
    String totalTco2e
}
