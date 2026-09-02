package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class InvoiceLineItem {
    
    String articleNumber
    
    String description
    
    String discountAmount
    
    String discountPercentage
    
    Boolean inputVatDeductible
    
    String inputVatRate
    
    Boolean isIntraCommunityAcquisition
    
    Boolean isMargin25a
    
    String ledgerAccount
    
    String lineTotal
    
    String lineTotalGross
    
    String margin25aPurchasePrice
    
    UUID meterPointId
    
    Long position
    
    Object priceComponents = null
    
    UUID productId
    
    String productSku
    
    String quantity
    
    String supplierArticleNumber
    
    String taxRate
    
    Object unit = null
    
    String unitPrice
    
    UUID usageDataId
    
    String vatRateNominal
    
    String vatSpecialCase
}
