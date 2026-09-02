package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CreateChannelDto
import org.openapitools.model.SupportChannel
import java.util.UUID
import org.openapitools.model.UpdateChannelDto

class SupportChannelApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createChannelApi ( CreateChannelDto createChannelDto, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/support/channels"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (createChannelDto == null) {
            throw new RuntimeException("missing required params createChannelDto")
        }



        contentType = 'application/json';
        bodyParams = createChannelDto


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    SupportChannel.class )

    }

    def deleteChannelApi ( UUID channelId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/support/channels/${channel_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (channelId == null) {
            throw new RuntimeException("missing required params channelId")
        }





        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def listChannelsApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/support/channels"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    SupportChannel.class )

    }

    def updateChannelApi ( UUID channelId, UpdateChannelDto updateChannelDto, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/support/channels/${channel_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (channelId == null) {
            throw new RuntimeException("missing required params channelId")
        }
        // verify required params are set
        if (updateChannelDto == null) {
            throw new RuntimeException("missing required params updateChannelDto")
        }



        contentType = 'application/json';
        bodyParams = updateChannelDto


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    SupportChannel.class )

    }

}
