package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Order
import org.openapitools.model.OrderStateUpdate
import org.openapitools.model.OrderTagsRequest
import org.openapitools.model.PluginError

class OrderApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def addOrderTags ( String orderId, OrderTagsRequest orderTagsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/orders/${order_id}/tags"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }
        // verify required params are set
        if (orderTagsRequest == null) {
            throw new RuntimeException("missing required params orderTagsRequest")
        }



        contentType = 'application/json';
        bodyParams = orderTagsRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Order.class )

    }

    def findOrderByExternalRef ( String extRef, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/orders/by-ext-ref/${ext_ref}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (extRef == null) {
            throw new RuntimeException("missing required params extRef")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Order.class )

    }

    def getOrder ( String orderNumber, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/order/${order_number}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (orderNumber == null) {
            throw new RuntimeException("missing required params orderNumber")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Order.class )

    }

    def getOrders ( Integer page, Integer pageSize, String search, Boolean includeDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/orders"

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
        if (search != null) {
            queryParams.put("search", search)
        }
        if (includeDeleted != null) {
            queryParams.put("include_deleted", includeDeleted)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    Order.class )

    }

    def patchOrder ( String orderId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/orders/${order_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }



        contentType = 'application/json';
        bodyParams = body


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    Order.class )

    }

    def replaceOrderTags ( String orderId, OrderTagsRequest orderTagsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/orders/${order_id}/tags"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }
        // verify required params are set
        if (orderTagsRequest == null) {
            throw new RuntimeException("missing required params orderTagsRequest")
        }



        contentType = 'application/json';
        bodyParams = orderTagsRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Order.class )

    }

    def updateOrderState ( String orderId, OrderStateUpdate orderStateUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/orders/${order_id}/state"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (orderId == null) {
            throw new RuntimeException("missing required params orderId")
        }
        // verify required params are set
        if (orderStateUpdate == null) {
            throw new RuntimeException("missing required params orderStateUpdate")
        }



        contentType = 'application/json';
        bodyParams = orderStateUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Order.class )

    }

}
