package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ConvertResponse
import org.openapitools.model.PluginError
import org.openapitools.model.ProformaInvoice

class ProformaInvoiceApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def convertProformaToInvoice ( String proformaId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/proforma-invoices/${proforma_id}/convert"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (proformaId == null) {
            throw new RuntimeException("missing required params proformaId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ConvertResponse.class )

    }

    def createProformaInvoice ( ProformaInvoice proformaInvoice, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/proforma-invoices"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (proformaInvoice == null) {
            throw new RuntimeException("missing required params proformaInvoice")
        }



        contentType = 'application/json';
        bodyParams = proformaInvoice


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ProformaInvoice.class )

    }

    def deleteProformaInvoice ( String proformaId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/proforma-invoices/${proforma_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (proformaId == null) {
            throw new RuntimeException("missing required params proformaId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getProformaInvoice ( String proformaId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/proforma-invoices/${proforma_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (proformaId == null) {
            throw new RuntimeException("missing required params proformaId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ProformaInvoice.class )

    }

    def listProformaInvoices ( Integer page, Integer pageSize, String status, String customerId, String orderNumber, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/proforma-invoices/"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (status != null) {
            queryParams.put("status", status)
        }
        if (customerId != null) {
            queryParams.put("customer_id", customerId)
        }
        if (orderNumber != null) {
            queryParams.put("order_number", orderNumber)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    ProformaInvoice.class )

    }

    def updateProformaInvoice ( String proformaId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/proforma-invoices/${proforma_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (proformaId == null) {
            throw new RuntimeException("missing required params proformaId")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }



        contentType = 'application/json';
        bodyParams = body


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    ProformaInvoice.class )

    }

}
