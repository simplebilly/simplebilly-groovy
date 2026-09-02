package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class JobTitleGap {
    
    Integer employeeCount
    
    String femaleMeanHourly
    
    String jobTitle
    
    String maleMeanHourly
    
    Double meanGapPct
    
    Double medianGapPct
}
