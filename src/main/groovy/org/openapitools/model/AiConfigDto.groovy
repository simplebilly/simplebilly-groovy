package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class AiConfigDto {
    
    Boolean autoReply
    
    Integer maxToolCalls
    
    String model
    
    String name
    
    String provider
    
    String systemPrompt
    
    List<String> triggerOn
}
