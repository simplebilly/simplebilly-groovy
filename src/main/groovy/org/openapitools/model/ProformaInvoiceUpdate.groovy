package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CurrencyCode;
import org.openapitools.model.ProformaInvoiceStatus;

@Canonical
class ProformaInvoiceUpdate {
    
    Date convertedAt
    /* Set when the proforma was converted into a real invoice. References the invoice entity. */
    String convertedToInvoiceId
    
    CurrencyCode currency
    /* References the customer entity. */
    String customerId
    /* Snapshot of the recipient at issue time (address, VAT id, …). */
    Object customerSnapshot = null
    
    Date issueDate
    
    Object lineItems = null
    
    String notes
    /* Reference to the order/quote this proforma belongs to. */
    String orderNumber
    /* Optional deadline the real invoice should carry after conversion. */
    Date paymentDueDate
    /* References the quotation entity. */
    String quotationId
    /* `draft` | `sent` | `converted`. */
    ProformaInvoiceStatus status
    
    String subtotal
    
    String totalAmount
    
    String totalTax
}
