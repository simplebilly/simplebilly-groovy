package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.ReplenishmentResponse

class ReplenishmentApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def applyReplenishments ( String targetWarehouseId, String sourceWarehouseId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/replenishments/apply"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (targetWarehouseId != null) {
            queryParams.put("targetWarehouseId", targetWarehouseId)
        }
        if (sourceWarehouseId != null) {
            queryParams.put("sourceWarehouseId", sourceWarehouseId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Object.class )

    }

    def getReplenishments ( String targetWarehouseId, String sourceWarehouseId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/replenishments"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (targetWarehouseId != null) {
            queryParams.put("targetWarehouseId", targetWarehouseId)
        }
        if (sourceWarehouseId != null) {
            queryParams.put("sourceWarehouseId", sourceWarehouseId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ReplenishmentResponse.class )

    }

}
