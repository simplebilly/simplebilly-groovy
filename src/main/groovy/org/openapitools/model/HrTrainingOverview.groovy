package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

@Canonical
class HrTrainingOverview {
    
    Long assignedCount
    
    String code
    
    Long completedCount
    
    Long overdueCount
    
    String title
    
    UUID trainingId
}
