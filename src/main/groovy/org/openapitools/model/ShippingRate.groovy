package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class ShippingRate {
    
    String breakdown
    
    String carrier
    
    String crossBorderSurcharge
    /* ISO-2 code of destination country. */
    String destinationCountry
    
    Integer estimatedDays
    /* True when the rate was obtained via an API call rather than calculation. */
    Boolean fromApi
    
    String insuredValue
    
    String islandSurcharge
    /* ISO-2 code of origin country. */
    String originCountry
    
    String rate
    
    String service
    
    String volumeDiscount
    
    Double weightKg
}
