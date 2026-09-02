package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ComplianceEntry;

@Canonical
class Verfahrensdokumentation {
    
    List<ComplianceEntry> entries = new ArrayList<>()
    
    String generatedAt
    
    String title
    
    String version
}
