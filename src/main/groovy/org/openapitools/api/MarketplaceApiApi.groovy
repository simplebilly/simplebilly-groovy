package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CreateConnectionRequest
import org.openapitools.model.MarketplaceConnection
import org.openapitools.model.OAuthAuthorizeRequest
import org.openapitools.model.OAuthAuthorizeResponse
import org.openapitools.model.OAuthCallbackRequest
import org.openapitools.model.PlatformInfo
import org.openapitools.model.SyncLog
import org.openapitools.model.SyncSummary
import org.openapitools.model.UpdateConnectionRequest
import org.openapitools.model.UpdateSyncDirectionRequest

class MarketplaceApiApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createConnectionApi ( CreateConnectionRequest createConnectionRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/marketplace/connections"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (createConnectionRequest == null) {
            throw new RuntimeException("missing required params createConnectionRequest")
        }



        contentType = 'application/json';
        bodyParams = createConnectionRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    MarketplaceConnection.class )

    }

    def deleteConnectionApi ( String connectionId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/marketplace/connections/${connection_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (connectionId == null) {
            throw new RuntimeException("missing required params connectionId")
        }





        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getConnectionApi ( String connectionId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/marketplace/connections/${connection_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (connectionId == null) {
            throw new RuntimeException("missing required params connectionId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    MarketplaceConnection.class )

    }

    def getSyncDirectionApi ( String connectionId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/marketplace/connections/${connection_id}/directions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (connectionId == null) {
            throw new RuntimeException("missing required params connectionId")
        }





        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    null )

    }

    def getSyncLogsApi ( String connectionId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/marketplace/connections/${connection_id}/logs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (connectionId == null) {
            throw new RuntimeException("missing required params connectionId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    SyncLog.class )

    }

    def listConnectionsApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/marketplace/connections"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    MarketplaceConnection.class )

    }

    def listPlatformsApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/marketplace/platforms"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    PlatformInfo.class )

    }

    def oauthAuthorizeApi ( OAuthAuthorizeRequest oauthAuthorizeRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/marketplace/oauth/authorize"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (oauthAuthorizeRequest == null) {
            throw new RuntimeException("missing required params oauthAuthorizeRequest")
        }



        contentType = 'application/json';
        bodyParams = oauthAuthorizeRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    OAuthAuthorizeResponse.class )

    }

    def oauthCallbackApi ( OAuthCallbackRequest oauthCallbackRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/marketplace/oauth/callback"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (oauthCallbackRequest == null) {
            throw new RuntimeException("missing required params oauthCallbackRequest")
        }



        contentType = 'application/json';
        bodyParams = oauthCallbackRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    MarketplaceConnection.class )

    }

    def triggerSyncApi ( String connectionId, String syncType, String direction, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/marketplace/connections/${connection_id}/sync"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (connectionId == null) {
            throw new RuntimeException("missing required params connectionId")
        }

        if (syncType != null) {
            queryParams.put("sync_type", syncType)
        }
        if (direction != null) {
            queryParams.put("direction", direction)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    SyncSummary.class )

    }

    def updateConnectionApi ( String connectionId, UpdateConnectionRequest updateConnectionRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/marketplace/connections/${connection_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (connectionId == null) {
            throw new RuntimeException("missing required params connectionId")
        }
        // verify required params are set
        if (updateConnectionRequest == null) {
            throw new RuntimeException("missing required params updateConnectionRequest")
        }



        contentType = 'application/json';
        bodyParams = updateConnectionRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    MarketplaceConnection.class )

    }

    def updateSyncDirectionApi ( String connectionId, UpdateSyncDirectionRequest updateSyncDirectionRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/marketplace/connections/${connection_id}/directions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (connectionId == null) {
            throw new RuntimeException("missing required params connectionId")
        }
        // verify required params are set
        if (updateSyncDirectionRequest == null) {
            throw new RuntimeException("missing required params updateSyncDirectionRequest")
        }



        contentType = 'application/json';
        bodyParams = updateSyncDirectionRequest


        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    null )

    }

    def webhookReceiverApi ( String platform, String connectionId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/marketplace/webhook/${platform}/${connection_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (platform == null) {
            throw new RuntimeException("missing required params platform")
        }
        // verify required params are set
        if (connectionId == null) {
            throw new RuntimeException("missing required params connectionId")
        }





        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

}
