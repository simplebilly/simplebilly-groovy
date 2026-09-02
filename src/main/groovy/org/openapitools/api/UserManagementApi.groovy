package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.TenantUser
import java.util.UUID
import org.openapitools.model.UpdatePermissionsPayload
import org.openapitools.model.UpdateRolePayload

class UserManagementApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getUser ( UUID userId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/users/${user_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    TenantUser.class )

    }

    def listUsers ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/users"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    TenantUser.class )

    }

    def removeUser ( UUID userId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/users/${user_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }





        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def updateUserPermissions ( UUID userId, UpdatePermissionsPayload updatePermissionsPayload, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/users/${user_id}/permissions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (updatePermissionsPayload == null) {
            throw new RuntimeException("missing required params updatePermissionsPayload")
        }



        contentType = 'application/json';
        bodyParams = updatePermissionsPayload


        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    null )

    }

    def updateUserRole ( UUID userId, UpdateRolePayload updateRolePayload, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/users/${user_id}/role"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (userId == null) {
            throw new RuntimeException("missing required params userId")
        }
        // verify required params are set
        if (updateRolePayload == null) {
            throw new RuntimeException("missing required params updateRolePayload")
        }



        contentType = 'application/json';
        bodyParams = updateRolePayload


        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    null )

    }

}
