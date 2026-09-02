package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class ProviderInfo {
    
    String displayName
    
    String name
    
    Boolean requiresApiKey
    
    List<String> services = new ArrayList<>()
    
    Boolean supportsLabelCreation
    
    Boolean supportsRateEstimation
    
    Boolean supportsTracking
}
