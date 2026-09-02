package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.KontoItem;

@Canonical
class KontoReport {
    
    String generatedAt
    
    List<KontoItem> konten = new ArrayList<>()
    
    String period
}
