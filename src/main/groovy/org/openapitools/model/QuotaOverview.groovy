package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.MeteredUsage;
import org.openapitools.model.PlanFeatures;
import org.openapitools.model.PlanLimits;
import org.openapitools.model.UsageSnapshot;

@Canonical
class QuotaOverview {
    
    PlanFeatures features
    
    Boolean isTrialing
    
    PlanLimits limits
    
    List<MeteredUsage> metered = new ArrayList<>()
    
    String plan
    
    String planName
    
    Date trialEndsAt
    
    UsageSnapshot usage
}
