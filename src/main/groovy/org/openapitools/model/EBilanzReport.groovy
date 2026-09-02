package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AccountOverview;
import org.openapitools.model.BalanceSheet;
import org.openapitools.model.IncomeStatement;
import org.openapitools.model.VatSummary;

@Canonical
class EBilanzReport {
    
    List<AccountOverview> accountOverview = new ArrayList<>()
    
    BalanceSheet balanceSheet
    
    String generatedAt
    
    IncomeStatement incomeStatement
    
    String period
    
    VatSummary vatSummary
}
