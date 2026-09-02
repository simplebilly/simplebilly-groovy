package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class ParticipationUpdate {
    /* Datum des Erwerbs der Beteiligung. */
    Date acquiredAt
    /* Bestellungsrecht für Geschäftsführung/Aufsichtsrat (§ 290 Abs. 2 Nr. 2 HGB). */
    Boolean boardAppointment
    /* Name des Beteiligungsunternehmens (§ 271 HGB). */
    String companyName
    /* Beherrschungsvertrag (§ 290 Abs. 2 Nr. 3 HGB). */
    Boolean controlAgreement
    /* Rechtsform, z. B. \"GmbH\". */
    String legalForm
    /* Anteilsquote in Prozent (§ 271 HGB; > 20 % widerlegbare Vermutung). */
    String ownershipPct
    /* Zweckgesellschaft (§ 290 Abs. 2 Nr. 4 HGB). */
    Boolean purposeVehicle
    /* Stimmrechtsmehrheit (§ 290 Abs. 2 Nr. 1 HGB). */
    Boolean votingMajority
}
