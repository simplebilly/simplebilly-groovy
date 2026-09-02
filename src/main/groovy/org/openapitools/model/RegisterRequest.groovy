package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class RegisterRequest {
    
    String companyName
    
    String email
    
    String firstName
    
    String lastName
    
    String password
    /* GDPR consent — registration is rejected unless true. */
    Boolean privacyAccepted
}
