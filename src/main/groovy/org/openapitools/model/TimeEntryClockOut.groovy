package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class TimeEntryClockOut {
    
    Date clockOut
    /* Optional manual hours; when absent, derived from clock_in..clock_out. */
    String hours
}
