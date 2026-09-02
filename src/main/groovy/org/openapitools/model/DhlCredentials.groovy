package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class DhlCredentials {
    /* DHL-API-Key from developer.dhl.com (required for tracking). */
    String apiKey
    /* Client credentials from the DHL developer app; required for label creation. */
    String clientId
    
    String clientSecret
}
