package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class StockAdjustment {
    
    String batchNumber
    
    String binLocation
    
    Date expiryDate
    
    UUID productId
    
    Long quantity
    
    List<String> serialNumbers
}
