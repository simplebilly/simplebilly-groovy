package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.GenerateCountRequest
import org.openapitools.model.InventoryCount
import org.openapitools.model.InventoryCountStatusUpdate
import org.openapitools.model.PluginError

class InventoryCountApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createInventoryCount ( InventoryCount inventoryCount, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/inventory-counts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (inventoryCount == null) {
            throw new RuntimeException("missing required params inventoryCount")
        }



        contentType = 'application/json';
        bodyParams = inventoryCount


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    InventoryCount.class )

    }

    def deleteInventoryCount ( String inventoryCountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/inventory-counts/${inventory_count_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (inventoryCountId == null) {
            throw new RuntimeException("missing required params inventoryCountId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def generateInventoryCount ( GenerateCountRequest generateCountRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/inventory-counts/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (generateCountRequest == null) {
            throw new RuntimeException("missing required params generateCountRequest")
        }



        contentType = 'application/json';
        bodyParams = generateCountRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    InventoryCount.class )

    }

    def getInventoryCount ( String inventoryCountId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/inventory-counts/${inventory_count_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (inventoryCountId == null) {
            throw new RuntimeException("missing required params inventoryCountId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    InventoryCount.class )

    }

    def listInventoryCounts ( Integer page, Integer pageSize, String status, String warehouseId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/inventory-counts/"

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
        if (warehouseId != null) {
            queryParams.put("warehouse_id", warehouseId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    InventoryCount.class )

    }

    def updateInventoryCount ( String inventoryCountId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/inventory-counts/${inventory_count_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (inventoryCountId == null) {
            throw new RuntimeException("missing required params inventoryCountId")
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
                    InventoryCount.class )

    }

    def updateInventoryCountStatus ( String inventoryCountId, InventoryCountStatusUpdate inventoryCountStatusUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/inventory-counts/${inventory_count_id}/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (inventoryCountId == null) {
            throw new RuntimeException("missing required params inventoryCountId")
        }
        // verify required params are set
        if (inventoryCountStatusUpdate == null) {
            throw new RuntimeException("missing required params inventoryCountStatusUpdate")
        }



        contentType = 'application/json';
        bodyParams = inventoryCountStatusUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    InventoryCount.class )

    }

}
