package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.SilentPartner
import org.openapitools.model.SilentPartnerCreate
import org.openapitools.model.SilentPartnerUpdate
import java.util.UUID

class SilentPartnerApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createSilentPartner ( SilentPartnerCreate silentPartnerCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/silent-partners"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (silentPartnerCreate == null) {
            throw new RuntimeException("missing required params silentPartnerCreate")
        }



        contentType = 'application/json';
        bodyParams = silentPartnerCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    SilentPartner.class )

    }

    def deleteSilentPartner ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/silent-partners/${id}"

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

    def getSilentPartner ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/silent-partners/${id}"

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
                    SilentPartner.class )

    }

    def getSilentPartners ( Integer page, Integer pageSize, String search, Boolean includeDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/silent-partners/"

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
                    SilentPartner.class )

    }

    def updateSilentPartner ( UUID id, SilentPartnerUpdate silentPartnerUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/silent-partners/${id}"

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
        if (silentPartnerUpdate == null) {
            throw new RuntimeException("missing required params silentPartnerUpdate")
        }



        contentType = 'application/json';
        bodyParams = silentPartnerUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    SilentPartner.class )

    }

}
