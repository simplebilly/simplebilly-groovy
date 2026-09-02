package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class PublicDeliveryAppointmentRequest {
    
    String email
    
    String notes
    
    Date requestedDate
    
    String supplierName
    
    String timeSlot
    /* Warehouse `code` — the supplier does not know the warehouse uuid. */
    String warehouseCode
}
