package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class ImportJobStatus {
    /* Set only when the job failed. */
    String error
    
    String jobId
    
    Long processed
    /* 0–100 */
    Integer progress
    /* Which competitor the import came from (lexoffice | billbee); the frontend uses it to label the job. Absent for legacy jobs. */
    String provider
    /* queued | fetching | downloading | importing | done */
    String stage
    /* pending | running | done | failed */
    String status
    
    Long total
}
