package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.EBilanzReport

class EbilanzApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def ebilanzReportApi ( Integer year, String dateFrom, String dateTo, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/ebilanz"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (year != null) {
            queryParams.put("year", year)
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
                    EBilanzReport.class )

    }

    def ebilanzXbrlExportApi ( Integer year, String dateFrom, String dateTo, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/ebilanz/xbrl"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (year != null) {
            queryParams.put("year", year)
        }
        if (dateFrom != null) {
            queryParams.put("date_from", dateFrom)
        }
        if (dateTo != null) {
            queryParams.put("date_to", dateTo)
        }




        accept = apiUtils.selectHeaderAccept(["application/xml"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    null )

    }

}
