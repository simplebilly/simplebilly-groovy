package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ReminderLevel;

@Canonical
class OpenItem {
    
    String amountDue
    
    String amountPaid
    
    String customerId
    
    Long daysOverdue
    
    String dueDate
    
    String invoiceId
    
    String invoiceNumber
    
    String issueDate
    
    String openAmount
    
    ReminderLevel reminderLevel
}
