package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CustomerGroup
import org.openapitools.model.CustomerGroupCreate
import org.openapitools.model.CustomerGroupUpdate
import org.openapitools.model.PluginError

class CustomerGroupApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def addGroupMembers ( String customerGroupId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/customer-groups/${customer_group_id}/members"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (customerGroupId == null) {
            throw new RuntimeException("missing required params customerGroupId")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }



        contentType = 'application/json';
        bodyParams = body


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    CustomerGroup.class )

    }

    def createCustomerGroup ( CustomerGroupCreate customerGroupCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/customer-groups"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (customerGroupCreate == null) {
            throw new RuntimeException("missing required params customerGroupCreate")
        }



        contentType = 'application/json';
        bodyParams = customerGroupCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    CustomerGroup.class )

    }

    def deleteCustomerGroup ( String customerGroupId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/customer-groups/${customer_group_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (customerGroupId == null) {
            throw new RuntimeException("missing required params customerGroupId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getCustomerGroup ( String customerGroupId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/customer-groups/${customer_group_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (customerGroupId == null) {
            throw new RuntimeException("missing required params customerGroupId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    CustomerGroup.class )

    }

    def listCustomerGroups ( Integer page, Integer pageSize, String search, Boolean includeDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/customer-groups/"

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
                    CustomerGroup.class )

    }

    def updateCustomerGroup ( String customerGroupId, CustomerGroupUpdate customerGroupUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/customer-groups/${customer_group_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (customerGroupId == null) {
            throw new RuntimeException("missing required params customerGroupId")
        }
        // verify required params are set
        if (customerGroupUpdate == null) {
            throw new RuntimeException("missing required params customerGroupUpdate")
        }



        contentType = 'application/json';
        bodyParams = customerGroupUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    CustomerGroup.class )

    }

}
