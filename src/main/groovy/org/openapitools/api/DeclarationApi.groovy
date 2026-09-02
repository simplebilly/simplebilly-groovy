package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Declaration
import org.openapitools.model.DeclarationCreate
import org.openapitools.model.DeclarationUpdate
import org.openapitools.model.PluginError
import java.util.UUID

class DeclarationApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createDeclaration ( DeclarationCreate declarationCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/declarations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (declarationCreate == null) {
            throw new RuntimeException("missing required params declarationCreate")
        }



        contentType = 'application/json';
        bodyParams = declarationCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Declaration.class )

    }

    def declarationRestore ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/declarations/${id}/restore"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Declaration.class )

    }

    def deleteDeclaration ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/declarations/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getDeclaration ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/declarations/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Declaration.class )

    }

    def getDeclarations ( Integer page, Integer pageSize, String search, Boolean includeDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/declarations/"

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
                    Declaration.class )

    }

    def updateDeclaration ( UUID id, DeclarationUpdate declarationUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/declarations/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }
        // verify required params are set
        if (declarationUpdate == null) {
            throw new RuntimeException("missing required params declarationUpdate")
        }



        contentType = 'application/json';
        bodyParams = declarationUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Declaration.class )

    }

}
