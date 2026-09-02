package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.SupplierInvoice
import org.openapitools.model.SupplierInvoiceStatusUpdate

class SupplierInvoiceApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createSupplierInvoice ( SupplierInvoice supplierInvoice, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/supplier-invoices"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (supplierInvoice == null) {
            throw new RuntimeException("missing required params supplierInvoice")
        }



        contentType = 'application/json';
        bodyParams = supplierInvoice


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    SupplierInvoice.class )

    }

    def deleteSupplierInvoice ( String supplierInvoiceId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/supplier-invoices/${supplier_invoice_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (supplierInvoiceId == null) {
            throw new RuntimeException("missing required params supplierInvoiceId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getSupplierInvoice ( String supplierInvoiceId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/supplier-invoices/${supplier_invoice_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (supplierInvoiceId == null) {
            throw new RuntimeException("missing required params supplierInvoiceId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    SupplierInvoice.class )

    }

    def listSupplierInvoices ( Integer page, Integer pageSize, String status, String purchaseOrderId, String supplierName, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/supplier-invoices/"

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
        if (purchaseOrderId != null) {
            queryParams.put("purchase_order_id", purchaseOrderId)
        }
        if (supplierName != null) {
            queryParams.put("supplier_name", supplierName)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    SupplierInvoice.class )

    }

    def updateSupplierInvoice ( String supplierInvoiceId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/supplier-invoices/${supplier_invoice_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (supplierInvoiceId == null) {
            throw new RuntimeException("missing required params supplierInvoiceId")
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
                    SupplierInvoice.class )

    }

    def updateSupplierInvoiceStatus ( String supplierInvoiceId, SupplierInvoiceStatusUpdate supplierInvoiceStatusUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/supplier-invoices/${supplier_invoice_id}/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (supplierInvoiceId == null) {
            throw new RuntimeException("missing required params supplierInvoiceId")
        }
        // verify required params are set
        if (supplierInvoiceStatusUpdate == null) {
            throw new RuntimeException("missing required params supplierInvoiceStatusUpdate")
        }



        contentType = 'application/json';
        bodyParams = supplierInvoiceStatusUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    SupplierInvoice.class )

    }

}
