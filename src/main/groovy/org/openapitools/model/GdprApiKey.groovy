package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class GdprApiKey {
    
    Date createdAt
    
    Date expiresAt
    
    UUID id
    
    UUID keyId
    
    String name
    
    Boolean revoked
}
