package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.SupplierInvoiceStatus;

@Canonical
class SupplierInvoiceCreate {
    
    String currency
    /* References the goods receipt entity. */
    String goodsReceiptId
    
    Date invoiceDate
    
    String invoiceNumber
    /* JSON array of `{product_id, name, quantity, unitPriceNet, taxRate}`. */
    Object lineItems = null
    
    String notes
    /* References the purchase order entity. */
    String purchaseOrderId
    /* One of: draft | matched | has_variances | posted | cancelled */
    SupplierInvoiceStatus status
    /* References the supplier entity. */
    String supplierContactId
    
    String supplierName
    
    String totalGrossAmount
    
    String totalNetAmount
}
