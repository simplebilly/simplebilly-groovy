package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.CustomerCommunication;

@Canonical
class ContactHistoryResponse {
    
    String contactId
    
    Long inboundCount
    
    List<CustomerCommunication> items = new ArrayList<>()
    
    Long outboundCount
}
