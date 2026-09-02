package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.EuerKatSumme;

@Canonical
class EuerZeileDetail {
    
    String abschnitt
    
    String betragGesamt
    
    String bezeichnung
    
    List<EuerKatSumme> kategorien = new ArrayList<>()
    
    Integer zeile
}
