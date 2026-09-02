package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.GroupFigure
import org.openapitools.model.GroupFigureCreate
import org.openapitools.model.GroupFigureUpdate
import org.openapitools.model.PluginError

class GroupFigureApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createGroupFigure ( GroupFigureCreate groupFigureCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/group-figures"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (groupFigureCreate == null) {
            throw new RuntimeException("missing required params groupFigureCreate")
        }



        contentType = 'application/json';
        bodyParams = groupFigureCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    GroupFigure.class )

    }

    def deleteGroupFigure ( Integer year, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/group-figures/${year}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (year == null) {
            throw new RuntimeException("missing required params year")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getGroupFigure ( Integer year, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/group-figures/${year}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (year == null) {
            throw new RuntimeException("missing required params year")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    GroupFigure.class )

    }

    def getGroupFigures ( Integer page, Integer pageSize, String search, Boolean includeDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/group-figures/"

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
                    GroupFigure.class )

    }

    def updateGroupFigure ( Integer year, GroupFigureUpdate groupFigureUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/group-figures/${year}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (year == null) {
            throw new RuntimeException("missing required params year")
        }
        // verify required params are set
        if (groupFigureUpdate == null) {
            throw new RuntimeException("missing required params groupFigureUpdate")
        }



        contentType = 'application/json';
        bodyParams = groupFigureUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    GroupFigure.class )

    }

}
