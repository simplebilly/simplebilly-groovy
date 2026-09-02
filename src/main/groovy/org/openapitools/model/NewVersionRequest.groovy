package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class NewVersionRequest {
    /* Storage key of the already-uploaded bytes. */
    String fileName
    
    Long fileSize
    
    String mimeType
    
    String originalName
    
    String sha256Hash
}
