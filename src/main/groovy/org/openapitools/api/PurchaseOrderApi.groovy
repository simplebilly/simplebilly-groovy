package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.InvoiceMatchRequest
import org.openapitools.model.PluginError
import org.openapitools.model.PurchaseOrder
import org.openapitools.model.PurchaseOrderStatusUpdate

class PurchaseOrderApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createPurchaseOrder ( PurchaseOrder purchaseOrder, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/purchase-orders"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (purchaseOrder == null) {
            throw new RuntimeException("missing required params purchaseOrder")
        }



        contentType = 'application/json';
        bodyParams = purchaseOrder


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PurchaseOrder.class )

    }

    def deletePurchaseOrder ( String purchaseOrderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/purchase-orders/${purchase_order_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (purchaseOrderId == null) {
            throw new RuntimeException("missing required params purchaseOrderId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getPurchaseOrder ( String purchaseOrderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/purchase-orders/${purchase_order_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (purchaseOrderId == null) {
            throw new RuntimeException("missing required params purchaseOrderId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    PurchaseOrder.class )

    }

    def listPurchaseOrders ( Integer page, Integer pageSize, String status, String supplierName, String search, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/purchase-orders/"

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
        if (supplierName != null) {
            queryParams.put("supplier_name", supplierName)
        }
        if (search != null) {
            queryParams.put("search", search)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    PurchaseOrder.class )

    }

    def matchInvoice ( String purchaseOrderId, InvoiceMatchRequest invoiceMatchRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/purchase-orders/${purchase_order_id}/match-invoice"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (purchaseOrderId == null) {
            throw new RuntimeException("missing required params purchaseOrderId")
        }
        // verify required params are set
        if (invoiceMatchRequest == null) {
            throw new RuntimeException("missing required params invoiceMatchRequest")
        }



        contentType = 'application/json';
        bodyParams = invoiceMatchRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Object.class )

    }

    def updatePurchaseOrder ( String purchaseOrderId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/purchase-orders/${purchase_order_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (purchaseOrderId == null) {
            throw new RuntimeException("missing required params purchaseOrderId")
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
                    PurchaseOrder.class )

    }

    def updatePurchaseOrderStatus ( String purchaseOrderId, PurchaseOrderStatusUpdate purchaseOrderStatusUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/purchase-orders/${purchase_order_id}/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (purchaseOrderId == null) {
            throw new RuntimeException("missing required params purchaseOrderId")
        }
        // verify required params are set
        if (purchaseOrderStatusUpdate == null) {
            throw new RuntimeException("missing required params purchaseOrderStatusUpdate")
        }



        contentType = 'application/json';
        bodyParams = purchaseOrderStatusUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    PurchaseOrder.class )

    }

}
