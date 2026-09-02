package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.SuitabilityRequest
import org.openapitools.model.SuitabilityResult

class SuitabilityApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def shippingSuitabilityApi ( SuitabilityRequest suitabilityRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipping/suitability"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (suitabilityRequest == null) {
            throw new RuntimeException("missing required params suitabilityRequest")
        }



        contentType = 'application/json';
        bodyParams = suitabilityRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    SuitabilityResult.class )

    }

}
