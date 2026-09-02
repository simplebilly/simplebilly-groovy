package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class GewerbesteuerErgebnis {
    
    String freibetrag
    
    String gesamtbelastung
    
    String gewerbeertrag
    
    String hebesatz
    
    Integer jahr
    
    String koerperschaftsteuer
    
    String land
    
    String messbetrag
    
    String steuer
    
    String steuerArt
}
