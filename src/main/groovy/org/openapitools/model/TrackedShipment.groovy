package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.TrackingEvent;

@Canonical
class TrackedShipment {
    
    String carrier
    
    List<TrackingEvent> events = new ArrayList<>()
    
    String labelUrl
    
    String status
    
    String trackingNumber
    
    String trackingUrl
}
