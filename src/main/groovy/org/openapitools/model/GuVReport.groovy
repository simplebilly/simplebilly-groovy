package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.GuVItem;

@Canonical
class GuVReport {
    
    List<GuVItem> expenses = new ArrayList<>()
    
    String generatedAt
    
    String netIncome
    
    String period
    
    List<GuVItem> revenue = new ArrayList<>()
    
    String totalExpenses
    
    String totalRevenue
}
