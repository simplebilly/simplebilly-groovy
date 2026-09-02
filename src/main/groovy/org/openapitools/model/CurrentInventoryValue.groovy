package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.InventoryValuePoint;

@Canonical
class CurrentInventoryValue {
    
    List<InventoryValuePoint> history = new ArrayList<>()
    
    Long productCount
    
    String totalPurchaseValue
    
    String totalSalesValue
}
