package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;

@Canonical
class AllocatePaymentRequest {
    
    Double amount
    
    String invoiceId
    
    UUID paymentId
}
