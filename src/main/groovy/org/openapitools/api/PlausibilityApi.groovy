package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PlausibilityReport

class PlausibilityApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def plausibilityCheckApi ( String dateFrom, String dateTo, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/plausibility"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (dateFrom != null) {
            queryParams.put("date_from", dateFrom)
        }
        if (dateTo != null) {
            queryParams.put("date_to", dateTo)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    PlausibilityReport.class )

    }

}
