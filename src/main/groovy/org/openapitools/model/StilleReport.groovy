package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.StillePartnerZeile;

@Canonical
class StilleReport {
    
    String jahresueberschuss
    
    List<StillePartnerZeile> partners = new ArrayList<>()
    
    Integer year
}
