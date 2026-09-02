package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.InstituteType;

@Canonical
class InstituteProfile {
    /* Institutsart: \"kein\" | \"kreditinstitut\" | \"finanzdienstleistungsinstitut\" | \"finanzunternehmen\" | \"versicherung\". */
    InstituteType instituteType
    /* Kapitalmarktorientierung (§ 325 Abs. 4 HGB): Offenlegungsfrist 4 statt 12 Monate. */
    Boolean kapitalmarktorientiert
}
