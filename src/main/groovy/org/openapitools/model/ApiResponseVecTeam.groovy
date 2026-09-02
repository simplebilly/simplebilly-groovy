package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ApiResponseTeamData;

@Canonical
class ApiResponseVecTeam {
    
    List<ApiResponseTeamData> data = new ArrayList<>()
    
    String error
    
    String message
    
    Boolean success
}
