package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.ProductCategory

class ProductCategoryApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createProductCategory ( ProductCategory productCategory, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/product-categories"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productCategory == null) {
            throw new RuntimeException("missing required params productCategory")
        }



        contentType = 'application/json';
        bodyParams = productCategory


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ProductCategory.class )

    }

    def deleteProductCategory ( String categoryId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/product-categories/${category_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (categoryId == null) {
            throw new RuntimeException("missing required params categoryId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getProductCategory ( String categoryId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/product-categories/${category_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (categoryId == null) {
            throw new RuntimeException("missing required params categoryId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ProductCategory.class )

    }

    def listProductCategories ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/product-categories"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    ProductCategory.class )

    }

    def updateProductCategory ( String categoryId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/product-categories/${category_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (categoryId == null) {
            throw new RuntimeException("missing required params categoryId")
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
                    ProductCategory.class )

    }

}
