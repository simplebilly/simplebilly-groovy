package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class CreateTicketRequest {
    
    UUID channelId
    
    String channelType
    
    String customerEmail
    
    String customerId
    
    String customerName
    
    String externalId
    
    String messageBody
    
    String orderRef
    
    String subject
}
