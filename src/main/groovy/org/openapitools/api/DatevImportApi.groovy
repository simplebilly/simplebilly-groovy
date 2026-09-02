package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.DatevImportResponse

class DatevImportApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def datevImportApi ( Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/datev/import"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }



        contentType = 'application/json';
        bodyParams = body


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    DatevImportResponse.class )

    }

}
