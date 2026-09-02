package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class InstituteDeadlines {
    /* HGB § 340k/§ 341k: Abschlussprüfung (5 Monate). */
    Integer abschlusspruefungMonths
    /* KWG § 26: Jahresabschluss an die BaFin (3 Monate, nur KWG-Institute). */
    Integer jahresabschlussBafinMonths
    /* HGB § 325 Abs. 4: Offenlegung (4 kapitalmarktorientiert / 12 sonst). */
    Integer offenlegungMonths
}
