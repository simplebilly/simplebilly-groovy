package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.OffenlegungItem;

@Canonical
class OffenlegungReport {
    /* Fristende (Abschlussstichtag + Frist). */
    Date deadline
    /* Offenlegungsfrist in Monaten (§ 325 Abs. 4 HGB). */
    Integer deadlineMonths
    
    List<OffenlegungItem> items = new ArrayList<>()
    /* Annahme über die Kapitalmarktorientierung. */
    Boolean kapitalmarktorientiert
    
    String note
    /* Berichtsjahr (laufendes Kalenderjahr). */
    Integer year
}
