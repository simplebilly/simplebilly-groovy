package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TrackingEvent;

@Canonical
class TrackingInfo {
    
    String carrier
    
    String estimatedDelivery
    
    List<TrackingEvent> events = new ArrayList<>()
    
    Object rawResponse = null
    
    String status
    
    String trackingNumber
}
