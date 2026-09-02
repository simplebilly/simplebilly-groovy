package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class KstErgebnis {
    
    String gesamt
    
    String gesamtbelastung
    
    String gewerbesteuer
    
    String gewinn
    
    Boolean istKapitalgesellschaft
    
    Integer jahr
    
    String koerperschaftsteuer
    
    String solidaritaetszuschlag
}
