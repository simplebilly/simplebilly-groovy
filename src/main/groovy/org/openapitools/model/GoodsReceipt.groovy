package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class GoodsReceipt {
    
    String grNumber
    /* JSON array of `{product_id, name, quantity, batch_number?, expiry_date?, bin_location?}`. */
    Object lineItems = null
    
    String notes
    /* References the purchase order entity. */
    String purchaseOrderId
    
    Date receiptDate
    /* References the supplier entity. */
    String supplierContactId
    
    String supplierName
    /* References the warehouse entity. */
    String warehouseId
}
