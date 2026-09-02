package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class UpsCredentials {
    /* OAuth 2.0 client credentials from developer.ups.com. */
    String clientId
    
    String clientSecret
    /* UPS account number; required for label creation, optional for rates/tracking. */
    String shipperNumber
}
