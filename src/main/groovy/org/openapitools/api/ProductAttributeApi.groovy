package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.ProductAttribute
import org.openapitools.model.ProductAttributeCreate
import org.openapitools.model.ProductAttributeUpdate
import java.util.UUID

class ProductAttributeApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createProductAttribute ( ProductAttributeCreate productAttributeCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/product-attributes"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productAttributeCreate == null) {
            throw new RuntimeException("missing required params productAttributeCreate")
        }



        contentType = 'application/json';
        bodyParams = productAttributeCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ProductAttribute.class )

    }

    def deleteProductAttribute ( String attributeId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/product-attributes/${attribute_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (attributeId == null) {
            throw new RuntimeException("missing required params attributeId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getProductAttribute ( String attributeId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/product-attributes/${attribute_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (attributeId == null) {
            throw new RuntimeException("missing required params attributeId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ProductAttribute.class )

    }

    def listProductAttributes ( Integer page, Integer pageSize, UUID productId, Boolean isFilterable, String search, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/product-attributes/"

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
        if (isFilterable != null) {
            queryParams.put("is_filterable", isFilterable)
        }
        if (search != null) {
            queryParams.put("search", search)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    ProductAttribute.class )

    }

    def updateProductAttribute ( String attributeId, ProductAttributeUpdate productAttributeUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/product-attributes/${attribute_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (attributeId == null) {
            throw new RuntimeException("missing required params attributeId")
        }
        // verify required params are set
        if (productAttributeUpdate == null) {
            throw new RuntimeException("missing required params productAttributeUpdate")
        }



        contentType = 'application/json';
        bodyParams = productAttributeUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    ProductAttribute.class )

    }

}
