package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class OffenlegungItem {
    /* Ob die zugrunde liegenden Daten im System vorhanden sind. */
    Boolean exists
    /* Bezeichnung des Offenlegungsbestandteils (§ 325 Abs. 1 HGB). */
    String name
    /* Woher der Bestandteil stammt bzw. fehlt. */
    String source
}
