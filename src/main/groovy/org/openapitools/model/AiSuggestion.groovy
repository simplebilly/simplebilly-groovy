package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class AiSuggestion {
    
    Double confidence
    
    String reasoning
    
    String suggestedPriority
    
    String suggestedReply
    
    String suggestedStatus
    
    List<String> toolCalls = new ArrayList<>()
}
