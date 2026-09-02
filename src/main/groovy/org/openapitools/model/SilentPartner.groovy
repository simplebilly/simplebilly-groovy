package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.InstrumentType;

@Canonical
class SilentPartner {
    /* Datum des Vertragsabschlusses. */
    Date contractDate
    /* Einlage (§ 230 HGB). */
    String einlage
    /* Gewinnbeteiligungsquote in Prozent (§ 231 HGB). */
    String gewinnquotePct
    /* Nicht erhobene Gewinne (§ 232 Abs. 3 HGB). */
    String gewinnvortrag
    /* Instrument: \"typisch\" | \"atypisch\" | \"partiarisches_darlehen\" | \"genussrecht\". */
    InstrumentType instrumentType
    /* 25 % Kapitalertragsteuer einbehalten (§ 43 Abs. 1 Nr. 3 EStG; typisch + partiarisches Darlehen). */
    Boolean kestPflichtig
    /* Name des stillen Gesellschafters. */
    String name
    /* Freitext-Notizen. */
    String notes
    /* Kumulierte Verluste gegen die Einlage (§ 232 Abs. 2 HGB, ≤ Einlage). */
    String verlustVerrechnungskonto
    /* Verlustbeteiligung (§ 231 Abs. 2 HGB; kann ausgeschlossen werden). */
    Boolean verlustbeteiligung
}
