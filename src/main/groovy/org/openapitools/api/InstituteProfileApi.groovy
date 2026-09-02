package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.InstituteProfile
import org.openapitools.model.InstituteProfileUpdate
import org.openapitools.model.PluginError

class InstituteProfileApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getInstituteProfile ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/institute-profile"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    InstituteProfile.class )

    }

    def updateInstituteProfile ( InstituteProfileUpdate instituteProfileUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/institute-profile"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (instituteProfileUpdate == null) {
            throw new RuntimeException("missing required params instituteProfileUpdate")
        }



        contentType = 'application/json';
        bodyParams = instituteProfileUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    InstituteProfile.class )

    }

}
