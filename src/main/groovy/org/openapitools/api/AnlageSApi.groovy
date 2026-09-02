package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AnlageSErgebnis

class AnlageSApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def anlageSApi ( Integer year, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/anlage-s"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (year == null) {
            throw new RuntimeException("missing required params year")
        }

        if (year != null) {
            queryParams.put("year", year)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    AnlageSErgebnis.class )

    }

}
