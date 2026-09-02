package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CreateChannelDto {
    
    String channelType
    
    Object config = null
    
    String name
}
