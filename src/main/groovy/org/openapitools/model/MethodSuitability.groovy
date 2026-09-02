package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ShippingRate;

@Canonical
class MethodSuitability {
    
    String carrier
    
    ShippingRate rate
    
    List<String> reasons = new ArrayList<>()
    
    String service
    
    Boolean suitable
}
