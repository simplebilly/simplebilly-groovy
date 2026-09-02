package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class InventoryValuePoint {
    
    Long productCount
    
    Date recordedAt
    
    String totalPurchaseValue
    
    String totalSalesValue
}
