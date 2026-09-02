package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BudgetKategorie;

@Canonical
class BudgetErgebnis {
    
    Integer jahr
    
    Integer monat
    
    List<BudgetKategorie> monatsBudget = new ArrayList<>()
    
    List<BudgetKategorie> prognoseRestjahr = new ArrayList<>()
}
