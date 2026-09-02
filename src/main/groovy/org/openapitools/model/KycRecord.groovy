package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class KycRecord {
    /* Referenz auf den Kunden/Kontakt. */
    String customerId
    /* Name des Kunden (für die Suche). */
    String customerName
    /* Datum der KYC-Prüfung (GwG § 8). */
    Date kycDate
    /* Freitext-Notizen. */
    String notes
    /* Aufbewahrungsfrist (GwG § 8 Abs. 4: 5 Jahre). */
    Date retentionUntil
    /* Risikoeinschätzung (z. B. Risikoklasse). */
    String riskAssessment
}
