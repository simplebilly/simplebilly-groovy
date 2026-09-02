package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.DatevBookingPreview
import org.openapitools.model.DatevExportResponse

class DatevApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def datevExportApi ( String accountSchema, String dateFrom, String dateTo, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/datev/export"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (accountSchema != null) {
            queryParams.put("account_schema", accountSchema)
        }
        if (dateFrom != null) {
            queryParams.put("date_from", dateFrom)
        }
        if (dateTo != null) {
            queryParams.put("date_to", dateTo)
        }
        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    DatevExportResponse.class )

    }

    def datevPreviewApi ( String accountSchema, String dateFrom, String dateTo, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/datev/preview"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (accountSchema != null) {
            queryParams.put("account_schema", accountSchema)
        }
        if (dateFrom != null) {
            queryParams.put("date_from", dateFrom)
        }
        if (dateTo != null) {
            queryParams.put("date_to", dateTo)
        }
        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    DatevBookingPreview.class )

    }

}
