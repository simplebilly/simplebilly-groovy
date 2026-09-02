package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.InstituteCheckItem;
import org.openapitools.model.InstituteDeadlines;

@Canonical
class InstituteStatus {
    
    List<InstituteCheckItem> checklist = new ArrayList<>()
    
    InstituteDeadlines deadlines
    
    String instituteType
    
    Boolean kapitalmarktorientiert
}
