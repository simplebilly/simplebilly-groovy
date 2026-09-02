package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BilanzItem;

@Canonical
class BilanzReport {
    
    List<BilanzItem> aktiva = new ArrayList<>()
    
    Boolean balanced
    
    String generatedAt
    
    List<BilanzItem> passiva = new ArrayList<>()
    
    String period
    
    String totalAktiva
    
    String totalPassiva
}
