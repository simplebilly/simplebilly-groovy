package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ReplenishmentSuggestionLine;

@Canonical
class ReplenishmentResponse {
    
    Date generatedAt
    
    List<ReplenishmentSuggestionLine> lines = new ArrayList<>()
    
    String targetWarehouseId
    
    Long totalSuggestedQuantity
}
