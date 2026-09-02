package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.Product
import org.openapitools.model.ProductCreate
import org.openapitools.model.ProductStock
import org.openapitools.model.ProductUpdate
import org.openapitools.model.StockUpdateRequest
import java.util.UUID

class ProductApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createProductApi ( ProductCreate productCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/products"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productCreate == null) {
            throw new RuntimeException("missing required params productCreate")
        }



        contentType = 'application/json';
        bodyParams = productCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Product.class )

    }

    def deleteProductApi ( UUID productId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/products/${product_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productId == null) {
            throw new RuntimeException("missing required params productId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getProductApi ( UUID productId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/products/${product_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productId == null) {
            throw new RuntimeException("missing required params productId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Product.class )

    }

    def getProductStockApi ( UUID productId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/products/${product_id}/stock"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productId == null) {
            throw new RuntimeException("missing required params productId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ProductStock.class )

    }

    def getProductsApi ( Integer page, Integer pageSize, String search, Boolean includeDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/products/"

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
                    Product.class )

    }

    def listLowStockProductsApi ( Long threshold, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/products/low-stock"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (threshold != null) {
            queryParams.put("threshold", threshold)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    ProductStock.class )

    }

    def productRestore ( UUID productId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/products/${product_id}/restore"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productId == null) {
            throw new RuntimeException("missing required params productId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Product.class )

    }

    def updateProductApi ( UUID productId, ProductUpdate productUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/products/${product_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productId == null) {
            throw new RuntimeException("missing required params productId")
        }
        // verify required params are set
        if (productUpdate == null) {
            throw new RuntimeException("missing required params productUpdate")
        }



        contentType = 'application/json';
        bodyParams = productUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Product.class )

    }

    def updateProductStockApi ( UUID productId, StockUpdateRequest stockUpdateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/products/${product_id}/stock"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productId == null) {
            throw new RuntimeException("missing required params productId")
        }
        // verify required params are set
        if (stockUpdateRequest == null) {
            throw new RuntimeException("missing required params stockUpdateRequest")
        }



        contentType = 'application/json';
        bodyParams = stockUpdateRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    ProductStock.class )

    }

}
