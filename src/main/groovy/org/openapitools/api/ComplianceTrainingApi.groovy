package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ComplianceTraining
import org.openapitools.model.ComplianceTrainingCreate
import org.openapitools.model.ComplianceTrainingUpdate
import org.openapitools.model.PluginError
import java.util.UUID

class ComplianceTrainingApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createComplianceTraining ( ComplianceTrainingCreate complianceTrainingCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/compliance-trainings"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (complianceTrainingCreate == null) {
            throw new RuntimeException("missing required params complianceTrainingCreate")
        }



        contentType = 'application/json';
        bodyParams = complianceTrainingCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ComplianceTraining.class )

    }

    def deleteComplianceTraining ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/compliance-trainings/${id}"

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

    def getComplianceTraining ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/compliance-trainings/${id}"

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
                    ComplianceTraining.class )

    }

    def getComplianceTrainings ( Integer page, Integer pageSize, String search, Boolean includeDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/compliance-trainings/"

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
                    ComplianceTraining.class )

    }

    def updateComplianceTraining ( UUID id, ComplianceTrainingUpdate complianceTrainingUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/compliance-trainings/${id}"

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
        if (complianceTrainingUpdate == null) {
            throw new RuntimeException("missing required params complianceTrainingUpdate")
        }



        contentType = 'application/json';
        bodyParams = complianceTrainingUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    ComplianceTraining.class )

    }

}
