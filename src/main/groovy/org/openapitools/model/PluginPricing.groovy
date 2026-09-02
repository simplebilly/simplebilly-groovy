package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.PluginPricingOneOf;
import org.openapitools.model.PluginPricingOneOf1;
import org.openapitools.model.PluginPricingOneOf2;

@Canonical
class PluginPricing {

    enum TypeEnum {
    
        FREE("free"),
        
        ONE_TIME("one_time"),
        
        RECURRING("recurring")
    
        private final String value
    
        TypeEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    
    TypeEnum type
    
    Double price
    
    Double pricePerMonth
}
