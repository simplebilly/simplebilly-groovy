package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class SubmitResultDto {
    /* Selected answer indices (required for scored builtin trainings). */
    List<Integer> answers = new ArrayList<>()
    
    UUID assignmentId
    /* Score 0–100. Only trusted for plugin trainings without server-side scoring; builtin trainings are always re-scored from `answers`. */
    Integer score
    
    String trainingCode
}
