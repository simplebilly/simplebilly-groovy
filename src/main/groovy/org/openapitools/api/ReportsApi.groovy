package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.BilanzReport
import org.openapitools.model.GuVReport
import org.openapitools.model.KontoReport
import org.openapitools.model.UmsatzsteuerReport

class ReportsApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def bilanzReportApi ( Integer year, Integer month, String dateFrom, String dateTo, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/reports/bilanz"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (year != null) {
            queryParams.put("year", year)
        }
        if (month != null) {
            queryParams.put("month", month)
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
                    BilanzReport.class )

    }

    def guvReportApi ( Integer year, Integer month, String dateFrom, String dateTo, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/reports/guv"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (year != null) {
            queryParams.put("year", year)
        }
        if (month != null) {
            queryParams.put("month", month)
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
                    GuVReport.class )

    }

    def kontenansichtReportApi ( Integer year, Integer month, String dateFrom, String dateTo, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/reports/kontenansicht"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (year != null) {
            queryParams.put("year", year)
        }
        if (month != null) {
            queryParams.put("month", month)
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
                    KontoReport.class )

    }

    def umsatzsteuerReportApi ( Integer year, Integer month, String dateFrom, String dateTo, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/reports/umsatzsteuer"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (year != null) {
            queryParams.put("year", year)
        }
        if (month != null) {
            queryParams.put("month", month)
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
                    UmsatzsteuerReport.class )

    }

}
