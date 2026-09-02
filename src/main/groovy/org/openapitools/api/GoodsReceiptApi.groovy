package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.GoodsReceipt
import org.openapitools.model.PluginError

class GoodsReceiptApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createGoodsReceipt ( GoodsReceipt goodsReceipt, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/goods-receipts"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (goodsReceipt == null) {
            throw new RuntimeException("missing required params goodsReceipt")
        }



        contentType = 'application/json';
        bodyParams = goodsReceipt


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    GoodsReceipt.class )

    }

    def deleteGoodsReceipt ( String goodsReceiptId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/goods-receipts/${goods_receipt_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (goodsReceiptId == null) {
            throw new RuntimeException("missing required params goodsReceiptId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getGoodsReceipt ( String goodsReceiptId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/goods-receipts/${goods_receipt_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (goodsReceiptId == null) {
            throw new RuntimeException("missing required params goodsReceiptId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    GoodsReceipt.class )

    }

    def listGoodsReceipts ( Integer page, Integer pageSize, String purchaseOrderId, String supplierName, String warehouseId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/goods-receipts/"

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
        if (purchaseOrderId != null) {
            queryParams.put("purchase_order_id", purchaseOrderId)
        }
        if (supplierName != null) {
            queryParams.put("supplier_name", supplierName)
        }
        if (warehouseId != null) {
            queryParams.put("warehouse_id", warehouseId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    GoodsReceipt.class )

    }

}
