package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class ProductCategory {
    
    String description
    
    String name
    /* References the category entity. */
    String parentCategoryId
    
    Integer sortOrder
}
