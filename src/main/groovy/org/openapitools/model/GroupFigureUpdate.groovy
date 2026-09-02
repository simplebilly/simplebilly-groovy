package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class GroupFigureUpdate {
    /* Bilanzsumme in EUR (§ 293 Abs. 1 Nr. 1 HGB). */
    String bilanzsumme
    /* § 291-Befreiung in Anspruch genommen. */
    Boolean exemptionClaimed
    /* Durchschnittliche Arbeitnehmerzahl (§ 293 Abs. 1 Nr. 3 HGB). */
    Long mitarbeiter
    /* Netto-Umsatzerlöse in EUR (§ 293 Abs. 1 Nr. 2 HGB). */
    String nettoUmsatz
    /* Name des Mutterunternehmens (§ 291 HGB, Zwischenholding). */
    String parentName
    /* Sitz des Mutterunternehmens, z. B. \"EU/EWR\" (§ 291 HGB). */
    String parentSitus
}
