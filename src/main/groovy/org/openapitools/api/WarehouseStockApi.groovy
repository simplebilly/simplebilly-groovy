package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.StockAdjustment
import java.util.UUID
import org.openapitools.model.WarehouseStock

class WarehouseStockApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createWarehouseStock ( String warehouseId, StockAdjustment stockAdjustment, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/warehouses/${warehouse_id}/stock"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (warehouseId == null) {
            throw new RuntimeException("missing required params warehouseId")
        }
        // verify required params are set
        if (stockAdjustment == null) {
            throw new RuntimeException("missing required params stockAdjustment")
        }



        contentType = 'application/json';
        bodyParams = stockAdjustment


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    WarehouseStock.class )

    }

    def deleteWarehouseStock ( String warehouseId, UUID productId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/warehouses/${warehouse_id}/stock/${product_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (warehouseId == null) {
            throw new RuntimeException("missing required params warehouseId")
        }
        // verify required params are set
        if (productId == null) {
            throw new RuntimeException("missing required params productId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def listWarehouseStock ( String warehouseId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/warehouses/${warehouse_id}/stock"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (warehouseId == null) {
            throw new RuntimeException("missing required params warehouseId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    WarehouseStock.class )

    }

    def updateWarehouseStock ( String warehouseId, UUID productId, StockAdjustment stockAdjustment, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/warehouses/${warehouse_id}/stock/${product_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (warehouseId == null) {
            throw new RuntimeException("missing required params warehouseId")
        }
        // verify required params are set
        if (productId == null) {
            throw new RuntimeException("missing required params productId")
        }
        // verify required params are set
        if (stockAdjustment == null) {
            throw new RuntimeException("missing required params stockAdjustment")
        }



        contentType = 'application/json';
        bodyParams = stockAdjustment


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    WarehouseStock.class )

    }

}
