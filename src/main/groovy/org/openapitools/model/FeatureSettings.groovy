package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class FeatureSettings {
    /* Online shop / storefront module (default: enabled). */
    Boolean onlineshop
    /* Bilanz (balance sheet) report. */
    Boolean reportBilanz
    /* BWA (betriebswirtschaftliche Auswertung). */
    Boolean reportBwa
    /* EÜR (Einnahmen-Überschuss-Rechnung). */
    Boolean reportEuer
    /* Gewerbesteuer report. */
    Boolean reportGewerbesteuer
    /* GuV (profit & loss) report. */
    Boolean reportGuv
    /* KSt (Körperschaftsteuer) report. */
    Boolean reportKst
    /* UStVA (Umsatzsteuervoranmeldung). */
    Boolean reportUstva
}
