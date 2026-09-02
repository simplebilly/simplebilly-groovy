package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AutomationDto
import org.openapitools.model.UpdateAutomation

class AutomationsApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def listAutomations ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/automations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    AutomationDto.class )

    }

    def triggerAutomation ( String key, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/automations/${key}/trigger"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (key == null) {
            throw new RuntimeException("missing required params key")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Object.class )

    }

    def updateAutomation ( String key, UpdateAutomation updateAutomation, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/automations/${key}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (key == null) {
            throw new RuntimeException("missing required params key")
        }
        // verify required params are set
        if (updateAutomation == null) {
            throw new RuntimeException("missing required params updateAutomation")
        }



        contentType = 'application/json';
        bodyParams = updateAutomation


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    AutomationDto.class )

    }

}
