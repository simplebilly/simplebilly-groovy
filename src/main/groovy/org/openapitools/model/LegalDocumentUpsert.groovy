package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class LegalDocumentUpsert {
    
    String content
    
    String docType
    
    String lang
    
    String title
}
