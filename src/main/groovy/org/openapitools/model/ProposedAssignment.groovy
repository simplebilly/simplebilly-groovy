package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class ProposedAssignment {
    
    String amountPaid
    
    Double confidence
    
    String customerId
    
    String invoiceId
    
    String invoiceNumber
    
    String openAmount
    
    String paymentDate
    
    UUID paymentId
    
    String reason
    
    String reference
}
