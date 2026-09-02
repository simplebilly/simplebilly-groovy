package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ChangelogEntry;
import org.openapitools.model.ConfigFieldInfo;
import org.openapitools.model.PluginPricing;

@Canonical
class PlatformInfo {
    
    String author
    
    List<ChangelogEntry> changelog = new ArrayList<>()
    
    List<String> configFieldNames = new ArrayList<>()
    
    List<ConfigFieldInfo> configFields = new ArrayList<>()
    
    String displayName
    
    String platform
    
    PluginPricing pricing
    
    List<String> supportedEntities = new ArrayList<>()
    
    Boolean supportsExport
    
    Boolean supportsImport
    
    Boolean supportsOauth
    
    String version
}
