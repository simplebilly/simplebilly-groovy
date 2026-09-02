package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.DeclarationType;

@Canonical
class DeclarationCreate {
    /* Art der Erklärung: \"dcgk\" (Entsprechenserklärung § 161 AktG) oder \"unternehmensfuehrung\" (Erklärung zur Unternehmensführung § 289f HGB). */
    DeclarationType declarationType
    /* Kennzeichnet die aktuell gültige Fassung (max. eine je Mandant). */
    Boolean isCurrent
    /* Inhalt der Erklärung als Markdown. */
    String text
    /* Datum, ab dem die Erklärung gilt. */
    Date validFrom
    /* Versionsbezeichnung der Erklärung (z.B. \"2025-01\"). */
    String version
}
