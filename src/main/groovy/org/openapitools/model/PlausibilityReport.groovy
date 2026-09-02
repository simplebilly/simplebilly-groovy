package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PlausibilityCheck;
import org.openapitools.model.PlausibilitySummary;

@Canonical
class PlausibilityReport {
    
    List<PlausibilityCheck> checks = new ArrayList<>()
    
    String generatedAt
    
    PlausibilitySummary summary
}
