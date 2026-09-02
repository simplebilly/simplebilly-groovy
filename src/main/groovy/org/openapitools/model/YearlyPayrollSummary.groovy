package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PayrollSummaryItem;

@Canonical
class YearlyPayrollSummary {
    
    Integer avgEmployeeCount
    
    List<PayrollSummaryItem> months = new ArrayList<>()
    
    Integer year
    
    String yearlyEmployerCost
    
    String yearlyGross
    
    String yearlyNet
}
