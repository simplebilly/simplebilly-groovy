package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CashflowReport {
    
    Double closingBalance
    
    Double financingCashflow
    
    Double investingCashflow
    
    Double netCashflow
    
    Double openingBalance
    
    Double operatingCashflow
    
    String period
}
