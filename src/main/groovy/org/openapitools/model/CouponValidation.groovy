package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class CouponValidation {
    
    String code
    
    String discountType
    
    String discountValue
    
    String discountedAmount
    
    String maxDiscountAmount
    
    String reason
    
    Boolean valid
}
