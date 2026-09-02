package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.StockMovement
import java.util.UUID

class StockMovementApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getStockMovement ( String movementId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/stock-movements/${movement_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (movementId == null) {
            throw new RuntimeException("missing required params movementId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    StockMovement.class )

    }

    def listStockMovements ( Integer page, Integer pageSize, UUID productId, String warehouseId, String movementType, Date from, Date to, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/stock-movements/"

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
        if (productId != null) {
            queryParams.put("productId", productId)
        }
        if (warehouseId != null) {
            queryParams.put("warehouseId", warehouseId)
        }
        if (movementType != null) {
            queryParams.put("movementType", movementType)
        }
        if (from != null) {
            queryParams.put("from", from)
        }
        if (to != null) {
            queryParams.put("to", to)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    StockMovement.class )

    }

}
