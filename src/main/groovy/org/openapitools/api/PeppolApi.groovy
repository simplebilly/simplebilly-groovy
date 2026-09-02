package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PeppolResponse

class PeppolApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def peppolApi ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/invoices/${id}/peppol"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    PeppolResponse.class )

    }

}
