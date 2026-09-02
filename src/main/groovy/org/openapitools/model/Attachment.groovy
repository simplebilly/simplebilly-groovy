package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class Attachment {
    /* Contact this attachment belongs to (per-contact DMS). References the contact entity. */
    String contactId
    
    String fileName
    
    Long fileSize
    
    String mimeType
    /* Raw text extracted by client-side OCR (tesseract.js), if run. */
    String ocrText
    
    String originalName
    
    String pdfaPath
    
    String sha256Hash
    
    UUID uploadedBy
}
