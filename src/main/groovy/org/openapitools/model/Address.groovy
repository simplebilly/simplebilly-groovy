package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class Address {
    
    String city
    
    String company
    /* ISO 3166-1 alpha-2 country code (e.g. \"DE\", \"PL\", \"FR\"). */
    String country
    
    String email
    
    String name
    
    String phone
    
    String street
    
    String streetNumber
    
    String zip
}
