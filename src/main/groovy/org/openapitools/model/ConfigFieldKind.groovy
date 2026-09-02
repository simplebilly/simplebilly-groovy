package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ConfigFieldKindOneOf;
import org.openapitools.model.ConfigFieldKindOneOf1;
import org.openapitools.model.ConfigFieldKindOneOf2;
import org.openapitools.model.ConfigFieldKindOneOf3;
import org.openapitools.model.ConfigFieldKindOneOf4;

@Canonical
class ConfigFieldKind {

    enum TypeEnum {
    
        TEXT("text"),
        
        SECRET("secret"),
        
        URL("url"),
        
        SELECT("select"),
        
        BOOL("bool")
    
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
    
    List<String> options = new ArrayList<>()
}
