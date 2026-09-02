package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.StilleExportResponse
import org.openapitools.model.StilleReport

class StilleApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def stilleExportApi ( Integer year, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/stille/export"

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
                    StilleExportResponse.class )

    }

    def stilleReportApi ( Integer year, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/stille/report"

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
                    StilleReport.class )

    }

}
