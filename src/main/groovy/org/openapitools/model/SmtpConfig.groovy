package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SmtpEncryption;

@Canonical
class SmtpConfig {
    
    SmtpEncryption encryption
    
    String fromAddress
    
    String fromName
    
    String host
    
    String password
    
    Integer port
    
    Long timeoutSeconds
    
    String username
}
