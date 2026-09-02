package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.EksMonatsWert;

@Canonical
class EksErgebnis {
    
    String gesamtergebnis
    
    List<EksMonatsWert> monate = new ArrayList<>()
    
    String prognoseNaechste6Monate
    
    String summeAusgaben
    
    String summeEinnahmen
    
    String zeitraumBis
    
    String zeitraumVon
}
