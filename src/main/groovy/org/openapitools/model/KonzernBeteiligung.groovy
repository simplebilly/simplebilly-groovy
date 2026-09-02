package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class KonzernBeteiligung {
    
    String companyName
    /* Erfüllte Kontroll-Indikatoren (§ 290 Abs. 2 HGB) als deutsche Bezeichnungen. */
    List<String> controlBasis = new ArrayList<>()
    
    Boolean controlled
    
    String ownershipPct
}
