package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CostingLine;

@Canonical
class ProductionOrderCosting {
    /* material_cost_total ÷ quantity. */
    String costPerUnit
    /* \"actual\" when costed from stock-movement consumption, else \"planned\". */
    String costSource
    
    List<CostingLine> lines = new ArrayList<>()
    /* sale_price − cost_per_unit. */
    String marginPerUnit
    /* margin_per_unit ÷ cost_per_unit as a percentage. */
    String marginPercent
    /* Total material cost for the whole order. */
    String materialCostTotal
    
    String orderNumber
    
    UUID productionOrderId
    
    Long quantity
    /* Finished product's sale price per unit (used to compute margin). */
    String salePrice
    
    String status
}
