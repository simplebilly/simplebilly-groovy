package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.JobStatus;

@Canonical
class Job {
    
    Integer attempts
    /* Discriminator the worker dispatches on (e.g. \"webhook.deliver\"). */
    String jobType
    
    Integer maxAttempts
    
    Object payload = null
    /* Earliest execution time; None = run now. */
    Date runAt
    /* pending | running | done | failed */
    JobStatus status
}
