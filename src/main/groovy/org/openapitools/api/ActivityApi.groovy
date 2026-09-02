package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Activity
import org.openapitools.model.ActivityStatusUpdate
import org.openapitools.model.PluginError

class ActivityApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createActivity ( Activity activity, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/activities"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (activity == null) {
            throw new RuntimeException("missing required params activity")
        }



        contentType = 'application/json';
        bodyParams = activity


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Activity.class )

    }

    def deleteActivity ( String activityId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/activities/${activity_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (activityId == null) {
            throw new RuntimeException("missing required params activityId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getActivity ( String activityId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/activities/${activity_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (activityId == null) {
            throw new RuntimeException("missing required params activityId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Activity.class )

    }

    def listActivities ( Integer page, Integer pageSize, String contactId, String activityType, String status, String assignedTo, Boolean overdueOnly, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/activities/"

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
            queryParams.put("pageSize", pageSize)
        }
        if (contactId != null) {
            queryParams.put("contactId", contactId)
        }
        if (activityType != null) {
            queryParams.put("activityType", activityType)
        }
        if (status != null) {
            queryParams.put("status", status)
        }
        if (assignedTo != null) {
            queryParams.put("assignedTo", assignedTo)
        }
        if (overdueOnly != null) {
            queryParams.put("overdueOnly", overdueOnly)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    Activity.class )

    }

    def updateActivity ( String activityId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/activities/${activity_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (activityId == null) {
            throw new RuntimeException("missing required params activityId")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }



        contentType = 'application/json';
        bodyParams = body


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Activity.class )

    }

    def updateActivityStatus ( String activityId, ActivityStatusUpdate activityStatusUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/activities/${activity_id}/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (activityId == null) {
            throw new RuntimeException("missing required params activityId")
        }
        // verify required params are set
        if (activityStatusUpdate == null) {
            throw new RuntimeException("missing required params activityStatusUpdate")
        }



        contentType = 'application/json';
        bodyParams = activityStatusUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Activity.class )

    }

}
