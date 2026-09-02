package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Absence
import org.openapitools.model.AbsenceCreate
import org.openapitools.model.AbsenceUpdate
import org.openapitools.model.PluginError
import java.util.UUID

class AbsenceApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createAbsence ( AbsenceCreate absenceCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/absences"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (absenceCreate == null) {
            throw new RuntimeException("missing required params absenceCreate")
        }



        contentType = 'application/json';
        bodyParams = absenceCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Absence.class )

    }

    def deleteAbsence ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/absences/${id}"

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

    def getAbsence ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/absences/${id}"

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
                    Absence.class )

    }

    def getAbsences ( Integer page, Integer pageSize, String search, Boolean includeDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/absences/"

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
                    Absence.class )

    }

    def updateAbsence ( UUID id, AbsenceUpdate absenceUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/absences/${id}"

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
        if (absenceUpdate == null) {
            throw new RuntimeException("missing required params absenceUpdate")
        }



        contentType = 'application/json';
        bodyParams = absenceUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Absence.class )

    }

}
