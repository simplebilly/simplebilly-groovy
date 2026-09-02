package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CompanyType;

@Canonical
class TenantSettings {
    
    CompanyType companyType
    
    Date dpaAcceptedAt
    
    String dpaAcceptedBy
    
    String dpaVersion
    /* Active feature toggles for the tenant. */
    Object features = null
}
