package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PayrollCreatePayload
import org.openapitools.model.PayrollPayPayload
import org.openapitools.model.PayrollRunApi
import java.util.UUID
import org.openapitools.model.YearlyPayrollSummary

class PayrollApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def payrollApprove ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payroll/${id}/approve"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PayrollRunApi.class )

    }

    def payrollAutopay ( String id, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payroll/${id}/autopay"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }



        contentType = 'application/json';
        bodyParams = body


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Object.class )

    }

    def payrollCalculate ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payroll/${id}/calculate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PayrollRunApi.class )

    }

    def payrollCreate ( PayrollCreatePayload payrollCreatePayload, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payroll"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (payrollCreatePayload == null) {
            throw new RuntimeException("missing required params payrollCreatePayload")
        }



        contentType = 'application/json';
        bodyParams = payrollCreatePayload


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PayrollRunApi.class )

    }

    def payrollDelete ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payroll/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def payrollElsterExport ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payroll/${id}/elster-export"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

    def payrollEmail ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payroll/${id}/email"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Object.class )

    }

    def payrollEntryPdf ( String id, String entryId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payroll/${id}/entries/${entry_id}/pdf"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }
        // verify required params are set
        if (entryId == null) {
            throw new RuntimeException("missing required params entryId")
        }





        accept = apiUtils.selectHeaderAccept(["application/pdf"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    null )

    }

    def payrollGet ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payroll/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    PayrollRunApi.class )

    }

    def payrollList ( Integer year, String status, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payroll"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (year != null) {
            queryParams.put("year", year)
        }
        if (status != null) {
            queryParams.put("status", status)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    PayrollRunApi.class )

    }

    def payrollPay ( UUID id, PayrollPayPayload payrollPayPayload, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payroll/${id}/pay"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }
        // verify required params are set
        if (payrollPayPayload == null) {
            throw new RuntimeException("missing required params payrollPayPayload")
        }



        contentType = 'application/json';
        bodyParams = payrollPayPayload


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PayrollRunApi.class )

    }

    def payrollPdf ( String id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payroll/${id}/pdf"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        accept = apiUtils.selectHeaderAccept(["application/pdf"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    null )

    }

    def payrollSummary ( Integer year, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payroll/summary/${year}"

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





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    YearlyPayrollSummary.class )

    }

    def payrollSvMeldungen ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payroll/${id}/sv-meldungen"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Object.class )

    }

}
