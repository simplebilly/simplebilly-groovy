package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.GdprActivity;
import org.openapitools.model.GdprApiKey;
import org.openapitools.model.GdprBillingInfo;
import org.openapitools.model.GdprNotification;
import org.openapitools.model.GdprRefreshToken;
import org.openapitools.model.GdprTenant;
import org.openapitools.model.GdprUsageEvent;
import org.openapitools.model.GdprUser;

@Canonical
class GdprExport {
    
    List<GdprActivity> activityLog = new ArrayList<>()
    /* Key identifiers and names only — never a usable credential. */
    List<GdprApiKey> apiKeys = new ArrayList<>()
    
    List<GdprBillingInfo> billing = new ArrayList<>()
    
    Date exportedAt
    /* Honesty field: this document is a plain data dump, never AI-generated. */
    Boolean generatedByAi
    
    List<GdprNotification> notifications = new ArrayList<>()
    /* Session records: metadata only, never the token hash. */
    List<GdprRefreshToken> refreshTokens = new ArrayList<>()
    
    List<GdprTenant> tenants = new ArrayList<>()
    
    List<GdprUsageEvent> usageEvents = new ArrayList<>()
    
    GdprUser user
}
