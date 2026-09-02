package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.StockTransfer
import org.openapitools.model.StockTransferStatusUpdate

class StockTransferApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createStockTransfer ( StockTransfer stockTransfer, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/stock-transfers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (stockTransfer == null) {
            throw new RuntimeException("missing required params stockTransfer")
        }



        contentType = 'application/json';
        bodyParams = stockTransfer


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    StockTransfer.class )

    }

    def deleteStockTransfer ( String stockTransferId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/stock-transfers/${stock_transfer_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (stockTransferId == null) {
            throw new RuntimeException("missing required params stockTransferId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getStockTransfer ( String stockTransferId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/stock-transfers/${stock_transfer_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (stockTransferId == null) {
            throw new RuntimeException("missing required params stockTransferId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    StockTransfer.class )

    }

    def listStockTransfers ( Integer page, Integer pageSize, String status, String warehouseId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/stock-transfers/"

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
                    StockTransfer.class )

    }

    def updateStockTransferStatus ( String stockTransferId, StockTransferStatusUpdate stockTransferStatusUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/stock-transfers/${stock_transfer_id}/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (stockTransferId == null) {
            throw new RuntimeException("missing required params stockTransferId")
        }
        // verify required params are set
        if (stockTransferStatusUpdate == null) {
            throw new RuntimeException("missing required params stockTransferStatusUpdate")
        }



        contentType = 'application/json';
        bodyParams = stockTransferStatusUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    StockTransfer.class )

    }

}
