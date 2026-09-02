package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CurrentInventoryValue
import org.openapitools.model.InventoryValuePoint
import org.openapitools.model.PluginError

class InventoryValueApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getInventoryValueApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/inventory-value"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    CurrentInventoryValue.class )

    }

    def recordInventoryValueApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/inventory-value/record"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    InventoryValuePoint.class )

    }

}
