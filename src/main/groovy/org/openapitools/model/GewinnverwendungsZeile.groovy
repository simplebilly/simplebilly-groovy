package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class GewinnverwendungsZeile {
    /* Betrag in EUR (2 Nachkommastellen, als String formatiert). */
    String betrag
    /* Deutsche Bezeichnung der Zeile. */
    String label
}
