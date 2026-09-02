package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class TotpSetupResponse {
    
    List<String> backupCodes = new ArrayList<>()
    
    String qrCodeUrl
    
    String secret
}
