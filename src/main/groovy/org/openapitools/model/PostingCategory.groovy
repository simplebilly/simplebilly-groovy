package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class PostingCategory {
    
    String accountNumber
    
    String accountNumberSkr03
    
    String accountNumberSkr04
    
    String accountNumberSkr49
    
    String categoryId
    
    Integer defaultVatRate
    
    String description
    
    String eksCategory
    
    Boolean isActive
    
    Boolean isSystem
    
    String name
    
    String skrVersion
    
    String type
}
