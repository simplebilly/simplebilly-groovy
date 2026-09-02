package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ServiceJobStatus;

@Canonical
class ServiceJobUpdate {
    /* Street + zip + city of the job location. */
    String address
    /* Customer email for email notifications. */
    String customerEmail
    /* References the customer entity. */
    UUID customerId
    /* Denormalized customer name for quick display. */
    String customerName
    /* Customer phone for SMS notifications later. */
    String customerPhone
    /* What work needs to be done. */
    String description
    /* Estimated time for the job in minutes. */
    Integer estimatedDurationMinutes
    /* Latitude for map display (OpenStreetMap). */
    Double lat
    /* Longitude for map display (OpenStreetMap). */
    Double lng
    
    String notes
    /* Dispatch status: \"pending\", \"assigned\", \"en_route\", \"in_progress\", \"completed\", \"cancelled\". */
    ServiceJobStatus status
}
