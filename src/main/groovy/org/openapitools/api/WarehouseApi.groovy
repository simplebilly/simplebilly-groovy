package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.Warehouse

class WarehouseApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createWarehouse ( Warehouse warehouse, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/warehouses"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (warehouse == null) {
            throw new RuntimeException("missing required params warehouse")
        }



        contentType = 'application/json';
        bodyParams = warehouse


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Warehouse.class )

    }

    def deleteWarehouse ( String warehouseId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/warehouses/${warehouse_id}"

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
                    "DELETE", "",
                    null )

    }

    def getWarehouse ( String warehouseId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/warehouses/${warehouse_id}"

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
                    "GET", "",
                    Warehouse.class )

    }

    def listWarehouses ( Integer page, Integer pageSize, String search, Boolean isActive, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/warehouses/"

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
        if (isActive != null) {
            queryParams.put("is_active", isActive)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    Warehouse.class )

    }

    def updateWarehouse ( String warehouseId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/warehouses/${warehouse_id}"

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
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }



        contentType = 'application/json';
        bodyParams = body


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Warehouse.class )

    }

}
