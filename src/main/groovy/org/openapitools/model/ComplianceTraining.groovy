package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TrainingSource;

@Canonical
class ComplianceTraining {
    /* Whether HR can assign this training as required for employees. */
    Boolean assignable
    /* Stable code used by plugins and frontend players (e.g. \"data_privacy\"). */
    String code
    
    Date createdAt
    
    Date deletedAt
    
    String description
    
    UUID id
    /* Minimum score (0–100) required to pass. */
    Integer passScore
    /* Marketplace plugin platform id when source = Plugin. */
    String pluginPlatform
    
    TrainingSource source
    
    UUID tenantId
    
    String title
    
    Date updatedAt
    /* Certificate validity in months; null = no expiry. */
    Integer validityMonths
}
