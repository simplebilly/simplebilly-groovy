package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.GenerateVariantsRequest
import org.openapitools.model.PluginError
import org.openapitools.model.ProductVariant
import java.util.UUID

class ProductVariantApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createProductVariant ( ProductVariant productVariant, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/product-variants"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productVariant == null) {
            throw new RuntimeException("missing required params productVariant")
        }



        contentType = 'application/json';
        bodyParams = productVariant


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ProductVariant.class )

    }

    def deleteProductVariant ( String variantId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/product-variants/${variant_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (variantId == null) {
            throw new RuntimeException("missing required params variantId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def generateProductVariants ( GenerateVariantsRequest generateVariantsRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/product-variants/generate"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (generateVariantsRequest == null) {
            throw new RuntimeException("missing required params generateVariantsRequest")
        }



        contentType = 'application/json';
        bodyParams = generateVariantsRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "array",
                    ProductVariant.class )

    }

    def getProductVariant ( String variantId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/product-variants/${variant_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (variantId == null) {
            throw new RuntimeException("missing required params variantId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ProductVariant.class )

    }

    def listProductVariants ( Integer page, Integer pageSize, UUID productId, Boolean isActive, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/product-variants/"

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
        if (productId != null) {
            queryParams.put("product_id", productId)
        }
        if (isActive != null) {
            queryParams.put("is_active", isActive)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    ProductVariant.class )

    }

    def updateProductVariant ( String variantId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/product-variants/${variant_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (variantId == null) {
            throw new RuntimeException("missing required params variantId")
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
                    ProductVariant.class )

    }

}
