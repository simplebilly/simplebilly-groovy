package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.KostenVorschau

class KostenVorschauApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def kostenVorschauApi ( Integer year, Integer month, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/kosten-vorschau"

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
        // verify required params are set
        if (month == null) {
            throw new RuntimeException("missing required params month")
        }

        if (year != null) {
            queryParams.put("year", year)
        }
        if (month != null) {
            queryParams.put("month", month)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    KostenVorschau.class )

    }

}
