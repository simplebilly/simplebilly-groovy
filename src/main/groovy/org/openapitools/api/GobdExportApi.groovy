package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.GoBDExportResponse
import org.openapitools.model.PluginError

class GobdExportApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def buchhalterCsvApi ( String dateFrom, String dateTo, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/buchhalter-csv"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (dateFrom == null) {
            throw new RuntimeException("missing required params dateFrom")
        }
        // verify required params are set
        if (dateTo == null) {
            throw new RuntimeException("missing required params dateTo")
        }

        if (dateFrom != null) {
            queryParams.put("date_from", dateFrom)
        }
        if (dateTo != null) {
            queryParams.put("date_to", dateTo)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    GoBDExportResponse.class )

    }

    def gobdExportApi ( Integer year, String format, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/gobd"

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
        if (format != null) {
            queryParams.put("format", format)
        }




        accept = apiUtils.selectHeaderAccept(["application/zip", "application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    null )

    }

}
