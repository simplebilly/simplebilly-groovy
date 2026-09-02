package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.CountryCode;

@Canonical
class WarehouseCreate {
    
    String addressCity
    
    CountryCode addressCountry
    
    String addressStreet
    
    String addressZip
    /* JSON array of bin locations, e.g. `[\"A-01-01\", \"A-01-02\"]`. */
    Object binLocations = null
    
    String code
    
    Boolean isActive
    
    Boolean isDefault
    
    String name
    
    String notes
}
