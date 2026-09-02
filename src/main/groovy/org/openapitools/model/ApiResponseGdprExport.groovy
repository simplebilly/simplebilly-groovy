package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ApiResponseGdprExportData;

@Canonical
class ApiResponseGdprExport {
    
    ApiResponseGdprExportData data
    
    String error
    
    String message
    
    Boolean success
}
