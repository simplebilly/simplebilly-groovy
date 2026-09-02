package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.MirrorTriggerResponse
import org.openapitools.model.PluginError

class AdminApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def triggerMirror ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/admin/storage/mirror"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    MirrorTriggerResponse.class )

    }

}
