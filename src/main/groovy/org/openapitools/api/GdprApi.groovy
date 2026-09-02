package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiResponseGdprExport
import org.openapitools.model.DpaAcceptRequest
import org.openapitools.model.DpaStatus
import org.openapitools.model.PluginError

class GdprApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def acceptDpa ( DpaAcceptRequest dpaAcceptRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/gdpr/dpa"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (dpaAcceptRequest == null) {
            throw new RuntimeException("missing required params dpaAcceptRequest")
        }



        contentType = 'application/json';
        bodyParams = dpaAcceptRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    DpaStatus.class )

    }

    def accountErasure ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/gdpr/account-erasure"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Object.class )

    }

    def erasureContact ( String contactId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/gdpr/erasure/${contact_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (contactId == null) {
            throw new RuntimeException("missing required params contactId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Object.class )

    }

    def exportContactData ( String contactId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/gdpr/export/${contact_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (contactId == null) {
            throw new RuntimeException("missing required params contactId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Object.class )

    }

    def exportGdpr ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/gdpr/export"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ApiResponseGdprExport.class )

    }

    def getDpa ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/gdpr/dpa"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    DpaStatus.class )

    }

}
