package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.PostingCategoryType;

@Canonical
class PostingCategoryUpdate {
    
    String accountNumber
    
    String accountNumberSkr03
    
    String accountNumberSkr04
    
    String accountNumberSkr49
    
    PostingCategoryType categoryType
    
    Date createdAt
    
    Integer defaultVatRate
    
    String description
    
    String eksCategory
    
    Integer euVatLine
    
    String inputVatPercentage
    
    Boolean isActive
    
    Boolean isSystem
    
    String name
    
    String skrVersion
    
    Date updatedAt
    
    Boolean userModifiedSkr03
    
    Boolean userModifiedSkr04
}
