package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.GewinnverwendungsZeile;

@Canonical
class GewinnverwendungsReport {
    /* Bilanzgewinn nach Einstellung (§ 174 AktG, Beschluss der HV). */
    String bilanzgewinn
    
    String gesetzlicheRuecklageBestand
    /* Deckel: 10 % des Grundkapitals (§ 150 Abs. 2 AktG). */
    String gesetzlicheRuecklageCap
    /* Rücklage nach Einstellung. */
    String gesetzlicheRuecklageNach
    /* Vorgeschlagene Einstellung in die gesetzliche Rücklage (§ 150 Abs. 2 AktG). */
    String gesetzlicheRuecklageSoll
    
    String gezeichnetesKapital
    
    String jahresueberschuss
    
    Integer year
    
    List<GewinnverwendungsZeile> zeilen = new ArrayList<>()
}
