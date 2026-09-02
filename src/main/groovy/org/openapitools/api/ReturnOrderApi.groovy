package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.ReturnLogisticsQueueItem
import org.openapitools.model.ReturnLogisticsSummary
import org.openapitools.model.ReturnOrder
import org.openapitools.model.ReturnOrderStatusUpdate

class ReturnOrderApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createReturnOrder ( ReturnOrder returnOrder, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/returns"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (returnOrder == null) {
            throw new RuntimeException("missing required params returnOrder")
        }



        contentType = 'application/json';
        bodyParams = returnOrder


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ReturnOrder.class )

    }

    def deleteReturnOrder ( String returnOrderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/returns/${return_order_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (returnOrderId == null) {
            throw new RuntimeException("missing required params returnOrderId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getReturnOrder ( String returnOrderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/returns/${return_order_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (returnOrderId == null) {
            throw new RuntimeException("missing required params returnOrderId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ReturnOrder.class )

    }

    def listReturnOrders ( Integer page, Integer pageSize, String status, String customerName, String orderNumber, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/returns/"

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
        if (customerName != null) {
            queryParams.put("customer_name", customerName)
        }
        if (orderNumber != null) {
            queryParams.put("order_number", orderNumber)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    ReturnOrder.class )

    }

    def returnLogisticsQueue ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/returns/logistics-queue"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    ReturnLogisticsQueueItem.class )

    }

    def returnLogisticsSummary ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/returns/logistics-summary"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ReturnLogisticsSummary.class )

    }

    def updateReturnOrder ( String returnOrderId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/returns/${return_order_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (returnOrderId == null) {
            throw new RuntimeException("missing required params returnOrderId")
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
                    ReturnOrder.class )

    }

    def updateReturnOrderStatus ( String returnOrderId, ReturnOrderStatusUpdate returnOrderStatusUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/returns/${return_order_id}/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (returnOrderId == null) {
            throw new RuntimeException("missing required params returnOrderId")
        }
        // verify required params are set
        if (returnOrderStatusUpdate == null) {
            throw new RuntimeException("missing required params returnOrderStatusUpdate")
        }



        contentType = 'application/json';
        bodyParams = returnOrderStatusUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    ReturnOrder.class )

    }

}
