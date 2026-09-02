package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AllocatePaymentRequest
import org.openapitools.model.BWAReport
import org.openapitools.model.CashflowReport
import org.openapitools.model.DunningResult
import org.openapitools.model.ElsterStatus
import org.openapitools.model.Invoice
import org.openapitools.model.LiquidityPosition
import org.openapitools.model.PluginError
import org.openapitools.model.Verfahrensdokumentation

class BookkeepingApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def allocatePaymentApi ( AllocatePaymentRequest allocatePaymentRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payments/allocate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (allocatePaymentRequest == null) {
            throw new RuntimeException("missing required params allocatePaymentRequest")
        }



        contentType = 'application/json';
        bodyParams = allocatePaymentRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

    def bwaReportApi ( Integer year, Integer month, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/bwa"

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




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    BWAReport.class )

    }

    def elsterStatusApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/elster/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ElsterStatus.class )

    }

    def elsterValidateApi ( String zeitraum, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/ustva/elster-validate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (zeitraum == null) {
            throw new RuntimeException("missing required params zeitraum")
        }

        if (zeitraum != null) {
            queryParams.put("zeitraum", zeitraum)
        }




        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

    def elsterXmlApi ( String zeitraum, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/ustva/elster-xml"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (zeitraum == null) {
            throw new RuntimeException("missing required params zeitraum")
        }

        if (zeitraum != null) {
            queryParams.put("zeitraum", zeitraum)
        }




        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    null )

    }

    def getCashflow ( Integer year, Integer month, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/cashflow"

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




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    CashflowReport.class )

    }

    def getLiquidity ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/liquidity"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    LiquidityPosition.class )

    }

    def getOpenInvoicesApi ( String customerId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payments/open-invoices/${customer_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (customerId == null) {
            throw new RuntimeException("missing required params customerId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    Invoice.class )

    }

    def getVerfahrensdokumentation ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/verfahrensdokumentation"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Verfahrensdokumentation.class )

    }

    def runDunningApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/dunning"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    DunningResult.class )

    }

}
