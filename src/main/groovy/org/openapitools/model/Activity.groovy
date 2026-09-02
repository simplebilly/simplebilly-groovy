package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ActivityStatus;
import org.openapitools.model.ActivityType;

@Canonical
class Activity {
    /* One of: call | email | meeting | task | note */
    ActivityType activityType
    /* User responsible (`employee.employee_id`). */
    String assignedTo
    /* Contact this activity belongs to (`contact.contact_id`). References the contact entity. */
    String contactId
    
    String description
    /* Follow-up / Wiedervorlage date. Open activities with a due date in the past are overdue. */
    Date dueDate
    /* When to remind about the follow-up. */
    Date reminderDate
    /* One of: open | done | cancelled */
    ActivityStatus status
    /* Short subject line. */
    String subject
}
