package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CommunicationChannel;
import org.openapitools.model.CommunicationDirection;

@Canonical
class CustomerCommunication {
    /* The message body, call summary or note text. */
    String body
    
    CommunicationChannel channel
    /* The contact (customer/supplier) this communication belongs to. References the contact entity. */
    String contactId
    /* Email/phone of the counterparty, if applicable. */
    String counterparty
    
    CommunicationDirection direction
    /* When the communication happened (defaults to now on create). */
    Date occurredAt
    
    String subject
    /* Free-form tags, e.g. `[\"follow-up-required\"]`. */
    Object tags = null
}
