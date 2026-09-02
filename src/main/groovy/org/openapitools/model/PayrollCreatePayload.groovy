package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ExtraPayment;

@Canonical
class PayrollCreatePayload {
    
    List<UUID> employeeIds = new ArrayList<>()
    
    List<ExtraPayment> extraPayments
    
    Integer month
    
    Integer year
}
