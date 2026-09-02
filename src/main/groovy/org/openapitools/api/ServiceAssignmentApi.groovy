package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.ServiceAssignment
import org.openapitools.model.ServiceAssignmentCreate
import org.openapitools.model.ServiceAssignmentUpdate
import java.util.UUID

class ServiceAssignmentApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createServiceAssignment ( ServiceAssignmentCreate serviceAssignmentCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/service-assignments"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (serviceAssignmentCreate == null) {
            throw new RuntimeException("missing required params serviceAssignmentCreate")
        }



        contentType = 'application/json';
        bodyParams = serviceAssignmentCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ServiceAssignment.class )

    }

    def deleteServiceAssignment ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/service-assignments/${id}"

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

    def getServiceAssignment ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/service-assignments/${id}"

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
                    ServiceAssignment.class )

    }

    def getServiceAssignments ( Integer page, Integer pageSize, String search, Boolean includeDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/service-assignments/"

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
                    ServiceAssignment.class )

    }

    def updateServiceAssignment ( UUID id, ServiceAssignmentUpdate serviceAssignmentUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/service-assignments/${id}"

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
        if (serviceAssignmentUpdate == null) {
            throw new RuntimeException("missing required params serviceAssignmentUpdate")
        }



        contentType = 'application/json';
        bodyParams = serviceAssignmentUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    ServiceAssignment.class )

    }

}
