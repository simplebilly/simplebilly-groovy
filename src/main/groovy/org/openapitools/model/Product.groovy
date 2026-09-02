package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class Product {
    
    String availability
    
    String barcode
    
    String brand
    
    String categoryId
    
    String condition
    
    String defaultLedgerAccount
    
    String defaultPrice
    /* References the price formula entity. */
    UUID defaultPriceFormulaId
    
    String defaultTaxRate
    
    String description
    
    String gtin
    
    String height
    
    String imageLink
    
    Object images = null
    
    Boolean isTaxable
    
    String length
    
    String link
    /* Target stock level used by reorder proposals. */
    Long maxStock
    /* Reorder point — when stock falls below this, a reorder is suggested. */
    Long minStock
    
    String mpn
    
    String name
    
    String packageHeight
    
    String packageLength
    
    String packageWeightUnit
    
    String packageWeightValue
    
    String packageWidth
    
    String productCode
    
    String productType
    
    String purchasePrice
    /* Suggested purchase quantity when a reorder proposal is created. */
    Long reorderQuantity
    
    String salePrice
    
    String shippingPrice
    
    Boolean shippingRequiresInsurance
    
    String sku
    
    Long stockQuantity
    
    Object tags = null
    
    String taxPrice
    /* Whether this product requires batch (Chargennummer) tracking. */
    Boolean trackBatch
    /* Whether this product requires serial-number tracking. */
    Boolean trackSerial
    
    Object unit = null
    
    String weightUnit
    
    String weightValue
    
    String width
}
