package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class AcceptInviteRequest {
    
    String firstName
    
    String lastName
    
    String password
    /* GDPR consent — rejected unless true. */
    Boolean privacyAccepted
    
    String token
}
