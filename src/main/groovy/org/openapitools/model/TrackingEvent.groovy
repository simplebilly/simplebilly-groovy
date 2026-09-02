package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class TrackingEvent {
    
    String date
    
    String description
    
    String location
    
    String status
}
