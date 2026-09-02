package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class AttachmentVersion {
    /* Parent attachment whose history this row records. */
    UUID attachmentId
    /* Storage key of this version's bytes. */
    String fileName
    
    Long fileSize
    
    String mimeType
    
    String originalName
    
    String sha256Hash
    
    UUID uploadedBy
    /* 1-based; ascending per attachment in upload order. */
    Integer versionNumber
}
