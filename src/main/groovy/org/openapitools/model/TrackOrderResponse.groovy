package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.TrackedShipment;

@Canonical
class TrackOrderResponse {
    
    String orderNumber
    
    String orderStatus
    
    List<TrackedShipment> shipments = new ArrayList<>()
}
