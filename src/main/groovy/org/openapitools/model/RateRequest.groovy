package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.Address;
import org.openapitools.model.CustomerInfo;
import org.openapitools.model.ModelPackage;

@Canonical
class RateRequest {
    
    CustomerInfo customer
    
    List<ModelPackage> packages = new ArrayList<>()
    
    Address recipient
    
    Address sender
}
