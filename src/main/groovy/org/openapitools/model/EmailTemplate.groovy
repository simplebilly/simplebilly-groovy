package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EmailTemplateStatus;

@Canonical
class EmailTemplate {
    /* E-mail body with optional placeholders. */
    String body
    /* Human-readable template name, e.g. \"Follow-up after quote\". */
    String name
    /* One of: active | inactive */
    EmailTemplateStatus status
    /* E-mail subject line with optional placeholders. */
    String subject
    /* Placeholders used by this template, e.g. `[\"contact.first_name\"]`. */
    Object variables = null
}
