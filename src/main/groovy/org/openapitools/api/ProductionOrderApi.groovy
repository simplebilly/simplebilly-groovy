package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.ProductionOrder
import org.openapitools.model.ProductionOrderCosting
import org.openapitools.model.ProductionOrderStatusUpdate
import java.util.UUID

class ProductionOrderApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createProductionOrder ( ProductionOrder productionOrder, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/production-orders"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productionOrder == null) {
            throw new RuntimeException("missing required params productionOrder")
        }



        contentType = 'application/json';
        bodyParams = productionOrder


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ProductionOrder.class )

    }

    def deleteProductionOrder ( UUID productionOrderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/production-orders/${production_order_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productionOrderId == null) {
            throw new RuntimeException("missing required params productionOrderId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getProductionOrder ( UUID productionOrderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/production-orders/${production_order_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productionOrderId == null) {
            throw new RuntimeException("missing required params productionOrderId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ProductionOrder.class )

    }

    def listProductionOrders ( Integer page, Integer pageSize, String search, String status, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/production-orders/"

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
            queryParams.put("pageSize", pageSize)
        }
        if (search != null) {
            queryParams.put("search", search)
        }
        if (status != null) {
            queryParams.put("status", status)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    ProductionOrder.class )

    }

    def productionOrderCosting ( UUID productionOrderId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/production-orders/${production_order_id}/costing"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productionOrderId == null) {
            throw new RuntimeException("missing required params productionOrderId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ProductionOrderCosting.class )

    }

    def updateProductionOrder ( UUID productionOrderId, ProductionOrder productionOrder, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/production-orders/${production_order_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productionOrderId == null) {
            throw new RuntimeException("missing required params productionOrderId")
        }
        // verify required params are set
        if (productionOrder == null) {
            throw new RuntimeException("missing required params productionOrder")
        }



        contentType = 'application/json';
        bodyParams = productionOrder


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    ProductionOrder.class )

    }

    def updateProductionOrderStatus ( UUID productionOrderId, ProductionOrderStatusUpdate productionOrderStatusUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/production-orders/${production_order_id}/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productionOrderId == null) {
            throw new RuntimeException("missing required params productionOrderId")
        }
        // verify required params are set
        if (productionOrderStatusUpdate == null) {
            throw new RuntimeException("missing required params productionOrderStatusUpdate")
        }



        contentType = 'application/json';
        bodyParams = productionOrderStatusUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    ProductionOrder.class )

    }

}
