package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class BudgetGoalRequest {
    /* Monthly goal amount (gross). 0 means \"no goal\" (fallback to default). */
    String monthlyGoal
    /* Budget year the goal applies to. */
    Integer year
}
