package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class Model {
    
    List<String> backupCodes = new ArrayList<>()
    
    Date createdAt
    
    Date deletedAt
    
    String email
    
    Boolean emailVerified
    
    UUID id
    
    Boolean isActive
    
    Boolean isTotpEnabled
    
    Date lastLogin
    
    String name
    
    String oauthId
    
    String oauthProvider
    /* Set on password change; auth/refresh tokens issued before this timestamp are rejected by the auth middleware. */
    Date passwordChangedAt
    
    String passwordHash
    
    String picture
    /* When the user accepted the data privacy policy (GDPR consent record). */
    Date privacyAcceptedAt
    
    String totpSecret
    
    Date updatedAt
}
