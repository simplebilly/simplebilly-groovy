package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiResponseString
import org.openapitools.model.ApiResponseTeam
import org.openapitools.model.ApiResponseUserProfile
import org.openapitools.model.ApiResponseVecTeam
import org.openapitools.model.ApiResponseVecUserTenantInfo
import org.openapitools.model.ChangePasswordRequest
import org.openapitools.model.InviteRequest
import org.openapitools.model.RemoveUserRequest
import org.openapitools.model.TeamCreate
import org.openapitools.model.UpdateProfileRequest

class UserApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def changePassword ( ChangePasswordRequest changePasswordRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user/change-password"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (changePasswordRequest == null) {
            throw new RuntimeException("missing required params changePasswordRequest")
        }



        contentType = 'application/json';
        bodyParams = changePasswordRequest


        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

    def createTeam ( TeamCreate teamCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user/teams"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (teamCreate == null) {
            throw new RuntimeException("missing required params teamCreate")
        }



        contentType = 'application/json';
        bodyParams = teamCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ApiResponseTeam.class )

    }

    def generateApiKey ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user/api-key"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ApiResponseString.class )

    }

    def inviteUser ( InviteRequest inviteRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user/invite"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (inviteRequest == null) {
            throw new RuntimeException("missing required params inviteRequest")
        }



        contentType = 'application/json';
        bodyParams = inviteRequest


        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

    def listTeams ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user/teams"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ApiResponseVecTeam.class )

    }

    def removeUserFromOrg ( RemoveUserRequest removeUserRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user/remove"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (removeUserRequest == null) {
            throw new RuntimeException("missing required params removeUserRequest")
        }



        contentType = 'application/json';
        bodyParams = removeUserRequest


        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def updateProfile ( UpdateProfileRequest updateProfileRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user/profile"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (updateProfileRequest == null) {
            throw new RuntimeException("missing required params updateProfileRequest")
        }



        contentType = 'application/json';
        bodyParams = updateProfileRequest


        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    null )

    }

    def userProfile ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user/profile"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ApiResponseUserProfile.class )

    }

    def userTenants ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/user/tenants"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ApiResponseVecUserTenantInfo.class )

    }

}
