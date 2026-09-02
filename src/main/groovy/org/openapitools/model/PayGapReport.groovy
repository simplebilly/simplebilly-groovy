package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.JobTitleGap;
import org.openapitools.model.QuartileBand;

@Canonical
class PayGapReport {
    
    List<JobTitleGap> byJobTitle = new ArrayList<>()
    
    Integer diverseCount
    
    Integer employeeCount
    
    Integer femaleCount
    
    Integer maleCount
    
    Double meanGapPct
    
    Double medianGapPct
    
    List<QuartileBand> quartiles = new ArrayList<>()
}
