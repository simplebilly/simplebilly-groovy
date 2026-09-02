package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class HebesatzLookup {
    
    String bundesland
    
    String countryCode
    
    String gemeindeName
    
    String gemeindeschluessel
    
    Double hebesatzGewerbesteuer
    
    Double hebesatzGrundsteuerB
    
    Integer jahr
    
    String landkreis
    
    String validFrom
    
    String validTo
}
