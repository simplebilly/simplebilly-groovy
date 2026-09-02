package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Bom
import org.openapitools.model.BomCreate
import org.openapitools.model.BomUpdate
import org.openapitools.model.PluginError
import java.util.UUID

class BomApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createBom ( BomCreate bomCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/boms"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (bomCreate == null) {
            throw new RuntimeException("missing required params bomCreate")
        }



        contentType = 'application/json';
        bodyParams = bomCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Bom.class )

    }

    def deleteBom ( UUID bomId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/boms/${bom_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (bomId == null) {
            throw new RuntimeException("missing required params bomId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getBom ( UUID bomId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/boms/${bom_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (bomId == null) {
            throw new RuntimeException("missing required params bomId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Bom.class )

    }

    def listBoms ( Integer page, Integer pageSize, String search, UUID productId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/boms/"

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
            queryParams.put("pageSize", pageSize)
        }
        if (search != null) {
            queryParams.put("search", search)
        }
        if (productId != null) {
            queryParams.put("productId", productId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    Bom.class )

    }

    def updateBom ( UUID bomId, BomUpdate bomUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/boms/${bom_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (bomId == null) {
            throw new RuntimeException("missing required params bomId")
        }
        // verify required params are set
        if (bomUpdate == null) {
            throw new RuntimeException("missing required params bomUpdate")
        }



        contentType = 'application/json';
        bodyParams = bomUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Bom.class )

    }

}
