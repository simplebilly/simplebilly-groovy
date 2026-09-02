package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DiscountType;

@Canonical
class CouponCreate {
    
    String code
    
    String description
    
    DiscountType discountType
    
    String discountValue
    
    Date expiresAt
    
    Boolean isActive
    
    Boolean isCombineable
    
    String maxDiscountAmount
    
    Integer maxUses
    
    Integer maxUsesPerCustomer
    
    String minOrderAmount
    
    Object productIds = null
    
    Date startsAt
}
