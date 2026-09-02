package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ApiResponseVecUserTenantInfoDataInner;

@Canonical
class ApiResponseVecUserTenantInfo {
    
    List<ApiResponseVecUserTenantInfoDataInner> data = new ArrayList<>()
    
    String error
    
    String message
    
    Boolean success
}
