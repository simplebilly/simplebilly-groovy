package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.VatItem;

@Canonical
class VatSummary {
    
    List<VatItem> inputTaxItems = new ArrayList<>()
    
    List<VatItem> outputTaxItems = new ArrayList<>()
    
    String totalInputTax
    
    String totalOutputTax
    
    String vatDue
}
