package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.ApplicationStatus;

@Canonical
class JobApplication {
    /* Relative path of the stored CV file under the upload dir. */
    String cvFile
    /* Extracted CV text, used for match-scoring. */
    String cvText
    
    String email
    
    String matchReason
    /* 0-100 LLM match score against the posting's required profile. */
    Integer matchScore
    
    String name
    
    String phone
    /* References the job_posting entity. */
    UUID postingId
    /* website | email | board */
    String source
    /* new | reviewing | interview | hired | rejected */
    ApplicationStatus status
}
