package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PayGapExportResponse
import org.openapitools.model.PayGapInfoResponse
import org.openapitools.model.PayGapReport
import org.openapitools.model.PluginError
import java.util.UUID

class PaygapApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def paygapAuskunftApi ( UUID employeeId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/paygap/auskunft/${employee_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (employeeId == null) {
            throw new RuntimeException("missing required params employeeId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    PayGapInfoResponse.class )

    }

    def paygapExportApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/paygap/export"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    PayGapExportResponse.class )

    }

    def paygapReportApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/paygap/report"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    PayGapReport.class )

    }

}
