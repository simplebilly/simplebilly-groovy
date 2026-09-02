package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AiConfigDto
import org.openapitools.model.AiSuggestion
import org.openapitools.model.AiSuggestionRequest
import org.openapitools.model.AiWorkerConfig
import org.openapitools.model.PluginError
import java.util.UUID

class AiApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def aiSuggestApi ( AiSuggestionRequest aiSuggestionRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/support/ai/suggest"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (aiSuggestionRequest == null) {
            throw new RuntimeException("missing required params aiSuggestionRequest")
        }



        contentType = 'application/json';
        bodyParams = aiSuggestionRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    AiSuggestion.class )

    }

    def createWorkerApi ( AiConfigDto aiConfigDto, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/support/ai/workers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (aiConfigDto == null) {
            throw new RuntimeException("missing required params aiConfigDto")
        }



        contentType = 'application/json';
        bodyParams = aiConfigDto


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    AiWorkerConfig.class )

    }

    def listWorkersApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/support/ai/workers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    AiWorkerConfig.class )

    }

    def runWorkerApi ( UUID workerId, AiSuggestionRequest aiSuggestionRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/support/ai/workers/${worker_id}/run"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (workerId == null) {
            throw new RuntimeException("missing required params workerId")
        }
        // verify required params are set
        if (aiSuggestionRequest == null) {
            throw new RuntimeException("missing required params aiSuggestionRequest")
        }



        contentType = 'application/json';
        bodyParams = aiSuggestionRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    AiSuggestion.class )

    }

}
