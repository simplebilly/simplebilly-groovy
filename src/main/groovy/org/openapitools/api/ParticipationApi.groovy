package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Participation
import org.openapitools.model.ParticipationCreate
import org.openapitools.model.ParticipationUpdate
import org.openapitools.model.PluginError
import java.util.UUID

class ParticipationApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createParticipation ( ParticipationCreate participationCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/participations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (participationCreate == null) {
            throw new RuntimeException("missing required params participationCreate")
        }



        contentType = 'application/json';
        bodyParams = participationCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Participation.class )

    }

    def deleteParticipation ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/participations/${id}"

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

    def getParticipation ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/participations/${id}"

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
                    Participation.class )

    }

    def getParticipations ( Integer page, Integer pageSize, String search, Boolean includeDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/participations/"

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
                    Participation.class )

    }

    def updateParticipation ( UUID id, ParticipationUpdate participationUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/participations/${id}"

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
        if (participationUpdate == null) {
            throw new RuntimeException("missing required params participationUpdate")
        }



        contentType = 'application/json';
        bodyParams = participationUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Participation.class )

    }

}
