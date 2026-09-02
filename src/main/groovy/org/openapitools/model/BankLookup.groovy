package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class BankLookup {
    
    String bankName
    
    String bic
    
    String iban
    
    String nextgenpsd2Url
    
    Boolean psd2Supported
}
