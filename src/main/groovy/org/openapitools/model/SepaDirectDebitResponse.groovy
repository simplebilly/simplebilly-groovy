package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class SepaDirectDebitResponse {
    
    String contentType
    
    String filename
    
    String xmlContent
}
