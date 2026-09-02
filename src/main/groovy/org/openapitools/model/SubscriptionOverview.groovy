package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PlanFeatures;
import org.openapitools.model.PlanLimits;
import org.openapitools.model.UsageSnapshot;

@Canonical
class SubscriptionOverview {
    
    Date currentPeriodEnd
    
    PlanFeatures features
    
    Boolean isTrialing
    
    PlanLimits limits
    
    String manageUrl
    /* Resolved plan id (free/starter/business/enterprise, or a custom override id). */
    String plan
    
    String planName
    /* Monthly price in EUR; `-1.0` = custom pricing (enterprise). */
    Double priceEur
    
    Integer quantity
    
    String status
    
    String subscriptionId
    
    Date trialEndsAt
    
    UsageSnapshot usage
}
