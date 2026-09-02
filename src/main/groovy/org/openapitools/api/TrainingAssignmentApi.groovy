package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.TrainingAssignment
import org.openapitools.model.TrainingAssignmentCreate
import org.openapitools.model.TrainingAssignmentUpdate
import java.util.UUID

class TrainingAssignmentApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createTrainingAssignment ( TrainingAssignmentCreate trainingAssignmentCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/training-assignments"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (trainingAssignmentCreate == null) {
            throw new RuntimeException("missing required params trainingAssignmentCreate")
        }



        contentType = 'application/json';
        bodyParams = trainingAssignmentCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    TrainingAssignment.class )

    }

    def deleteTrainingAssignment ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/training-assignments/${id}"

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

    def getTrainingAssignment ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/training-assignments/${id}"

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
                    TrainingAssignment.class )

    }

    def getTrainingAssignments ( Integer page, Integer pageSize, String search, Boolean includeDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/training-assignments/"

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
                    TrainingAssignment.class )

    }

    def updateTrainingAssignment ( UUID id, TrainingAssignmentUpdate trainingAssignmentUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/training-assignments/${id}"

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
        if (trainingAssignmentUpdate == null) {
            throw new RuntimeException("missing required params trainingAssignmentUpdate")
        }



        contentType = 'application/json';
        bodyParams = trainingAssignmentUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    TrainingAssignment.class )

    }

}
