package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.EmissionMethod;
import org.openapitools.model.GhgScope;

@Canonical
class EmissionEntry {
    /* Activity amount in `unit` (kWh, l, km, t, tkm, EUR). */
    String activityValue
    /* GHG-Protocol category key, e.g. \"purchased_goods\", \"business_travel\". */
    String categoryId
    
    String description
    /* Emission-factor source, e.g. \"UBA-2024\", \"DEFRA-2024\". */
    String efSource
    
    String efVersion
    /* \"activity\" | \"spend\" | \"supplier\". */
    EmissionMethod method
    /* GHG scope: \"1\" | \"2\" | \"3\". */
    GhgScope scope
    /* Computed server-side: activity * factor / 1000, rounded to 4 dp. */
    String tco2e
    /* Unit of the activity value. */
    String unit
    
    Date updatedAt
    /* Reporting year. */
    Integer year
}
