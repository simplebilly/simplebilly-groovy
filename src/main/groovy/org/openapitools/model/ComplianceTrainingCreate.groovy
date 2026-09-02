package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TrainingSource;

@Canonical
class ComplianceTrainingCreate {
    /* Whether HR can assign this training as required for employees. */
    Boolean assignable
    /* Stable code used by plugins and frontend players (e.g. \"data_privacy\"). */
    String code
    
    String description
    /* Minimum score (0–100) required to pass. */
    Integer passScore
    /* Marketplace plugin platform id when source = Plugin. */
    String pluginPlatform
    
    TrainingSource source
    
    String title
    /* Certificate validity in months; null = no expiry. */
    Integer validityMonths
}
