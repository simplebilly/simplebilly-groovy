package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class ReorderProposalLine {
    
    Long currentStock
    
    Long maxStock
    
    Long minStock
    
    UUID productId
    
    String productName
    
    Long reorderQuantity
    
    String sku
    
    Long suggestedQuantity
}
