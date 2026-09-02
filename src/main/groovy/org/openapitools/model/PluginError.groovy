package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PluginErrorOneOf;
import org.openapitools.model.PluginErrorOneOf1;
import org.openapitools.model.PluginErrorOneOf2;
import org.openapitools.model.PluginErrorOneOf3;
import org.openapitools.model.PluginErrorOneOf4;
import org.openapitools.model.PluginErrorOneOf5;
import org.openapitools.model.PluginErrorOneOf6;

@Canonical
class PluginError {
    
    List<Object> badRequest = new ArrayList<>()
    
    List<Object> notFound = new ArrayList<>()
    
    List<Object> unauthorized = new ArrayList<>()
    
    List<Object> internalError = new ArrayList<>()
    
    List<Object> databaseError = new ArrayList<>()
    
    List<Object> validationError = new ArrayList<>()
    
    String notImplemented
}
