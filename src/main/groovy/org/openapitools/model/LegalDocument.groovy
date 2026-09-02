package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LanguageCode;
import org.openapitools.model.LegalDocType;

@Canonical
class LegalDocument {
    /* Plain text, `\\n\\n` separates paragraphs. */
    String content
    
    LegalDocType docType
    
    LanguageCode lang
    
    String title
}
