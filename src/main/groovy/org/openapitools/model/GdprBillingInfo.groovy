package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class GdprBillingInfo {
    
    Date currentPeriodEnd
    
    Date currentPeriodStart
    
    String plan
    
    String status
    
    UUID tenantId
}
