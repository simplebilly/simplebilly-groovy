package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.DatevImportRow;

@Canonical
class DatevImportResponse {
    
    Integer count
    
    String filename
    
    List<DatevImportRow> rows = new ArrayList<>()
}
