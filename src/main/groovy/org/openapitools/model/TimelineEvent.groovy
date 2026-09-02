package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class TimelineEvent {
    /* RFC3339 UTC timestamp for sorting. */
    String date
    
    String detail
    /* Source record id (stringified). */
    String id
    
    String status
    
    String title
    /* Source module: communication | quotation | order | invoice | attachment. */
    String type
}
