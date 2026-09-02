package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.VatDetail;

@Canonical
class UmsatzsteuerReport {
    
    String generatedAt
    
    List<VatDetail> inputTax = new ArrayList<>()
    
    List<VatDetail> outputTax = new ArrayList<>()
    
    String period
    
    String totalInputTax
    
    String totalOutputTax
    
    String vatPayable
    
    String vatRefund
}
