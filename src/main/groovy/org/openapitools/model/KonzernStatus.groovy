package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.KonzernBeteiligung;
import org.openapitools.model.KonzernThresholds;

@Canonical
class KonzernStatus {
    
    Boolean groessenbefreit
    
    Boolean kapitalmarktorientiert
    
    Boolean konzernabschlusspflicht
    /* Keine group_figures-Zeile für das Jahr vorhanden → keine Größenbefreiung. */
    Boolean missingGroupFigures
    /* Mutterunternehmen: mindestens eine beherrschte Beteiligung (§ 290 Abs. 1 HGB). */
    Boolean mutterunternehmen
    /* Mutterunternehmen für die Zwischenholding-Befreiung (§ 291 HGB). */
    String parentName
    
    String parentSitus
    
    List<KonzernBeteiligung> participations = new ArrayList<>()
    
    KonzernThresholds thresholds
    
    Integer year
    
    Boolean zwischenholdingBefreit
    /* Hinweis zu den § 291-Voraussetzungen (EU/EWR-Sitz, geprüfter Konzernabschluss). */
    String zwischenholdingHinweis
}
