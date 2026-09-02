package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class BudgetKategorie {
    
    String budget
    
    String differenz
    /* User-set monthly goal for the category, if any. */
    String goal
    
    String ist
    
    String kategorie
}
