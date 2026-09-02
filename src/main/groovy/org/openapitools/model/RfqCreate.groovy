package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RfqStatus;

@Canonical
class RfqCreate {
    
    String currency
    /* JSON array of `{product_id, name, sku, quantity, requested_unit_price?, quoted_unit_price?}`. */
    Object lineItems = null
    
    String notes
    
    Date requestedDate
    
    Date responseDate
    
    String rfqNumber
    /* One of: draft | sent | offer_received | rejected | converted */
    RfqStatus status
    /* References the supplier entity. */
    String supplierContactId
    
    String supplierName
}
