package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ReorderProposalLine;

@Canonical
class ReorderProposalResponse {
    
    Date generatedAt
    
    List<ReorderProposalLine> lines = new ArrayList<>()
    
    Long totalSuggestedQuantity
}
