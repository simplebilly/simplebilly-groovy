package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.PublicReturnRequest
import org.openapitools.model.PublicReturnResponse
import org.openapitools.model.PublicReturnStatusResponse

class PublicReturnsApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getPublicReturnStatus ( String email, String returnNumber, String returnOrderId, String orderNumber, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/public/returns/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (email == null) {
            throw new RuntimeException("missing required params email")
        }

        if (returnNumber != null) {
            queryParams.put("returnNumber", returnNumber)
        }
        if (returnOrderId != null) {
            queryParams.put("returnOrderId", returnOrderId)
        }
        if (email != null) {
            queryParams.put("email", email)
        }
        if (orderNumber != null) {
            queryParams.put("orderNumber", orderNumber)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    PublicReturnStatusResponse.class )

    }

    def listPublicReturns ( String orderNumber, String email, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/public/returns/list"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (orderNumber == null) {
            throw new RuntimeException("missing required params orderNumber")
        }
        // verify required params are set
        if (email == null) {
            throw new RuntimeException("missing required params email")
        }

        if (orderNumber != null) {
            queryParams.put("orderNumber", orderNumber)
        }
        if (email != null) {
            queryParams.put("email", email)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    PublicReturnStatusResponse.class )

    }

    def requestPublicReturn ( PublicReturnRequest publicReturnRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/public/returns/request"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (publicReturnRequest == null) {
            throw new RuntimeException("missing required params publicReturnRequest")
        }



        contentType = 'application/json';
        bodyParams = publicReturnRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PublicReturnResponse.class )

    }

}
