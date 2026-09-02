package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Address;
import org.openapitools.model.CartItemInput;

@Canonical
class SuitabilityRequest {
    
    Integer customerAnnualVolume
    
    List<CartItemInput> items = new ArrayList<>()
    
    Address recipient
    
    Address sender
}
