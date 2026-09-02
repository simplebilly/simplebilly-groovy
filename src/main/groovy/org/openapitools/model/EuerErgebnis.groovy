package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.EuerZeile;

@Canonical
class EuerErgebnis {
    
    String anlageZugaenge
    
    String gewinnVerlust
    
    Integer jahr
    
    String summeAusgaben
    
    String summeEinnahmen
    
    List<EuerZeile> zeilen = new ArrayList<>()
}
