package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DeliveryAppointmentStatus;

@Canonical
class DeliveryAppointment {
    
    String email
    
    String notes
    
    String phone
    
    Date requestedDate
    /* One of: requested | confirmed | arrived | cancelled | completed */
    DeliveryAppointmentStatus status
    
    String supplierName
    /* e.g. \"08:00-10:00\" */
    String timeSlot
    /* References the warehouse entity. */
    String warehouseId
}
