package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PnLItem;

@Canonical
class IncomeStatement {
    
    List<PnLItem> expenseItems = new ArrayList<>()
    
    String netIncome
    
    List<PnLItem> revenueItems = new ArrayList<>()
    
    String totalExpenses
    
    String totalRevenue
}
