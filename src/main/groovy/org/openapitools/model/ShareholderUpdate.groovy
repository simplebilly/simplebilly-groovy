package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class ShareholderUpdate {
    /* Anschrift des Aktionärs (§ 67 Abs. 1 AktG). */
    String address
    /* Geburtsdatum des Aktionärs (§ 67 Abs. 1 AktG). */
    Date birthDate
    /* Elektronische Adresse (E-Mail) für die Kommunikation der Gesellschaft. */
    String email
    /* Vorname des Aktionärs (§ 67 Abs. 1 AktG). */
    String firstName
    /* Nachname des Aktionärs (§ 67 Abs. 1 AktG). */
    String lastName
    /* Aktiennummer bzw. Sammelurkunde (bei Nennbetragsaktien). */
    String shareNumber
    /* Stückzahl der gehaltenen Stückaktien (§ 67 Abs. 1 AktG). */
    String shares
}
