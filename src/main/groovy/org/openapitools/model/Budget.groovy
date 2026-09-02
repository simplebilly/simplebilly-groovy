package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class Budget {
    /* Posting category key (matches `category` on journal entries). */
    String category
    /* Monthly goal amount (gross). 0 means \"no goal set\". */
    String monthlyGoal
    
    Date updatedAt
    /* Budget year the goal applies to. */
    Integer year
}
