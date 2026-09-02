package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AccountOverview {
    
    String account
    
    String accountName
    
    String balance
    
    String creditTotal
    
    String debitTotal
}
