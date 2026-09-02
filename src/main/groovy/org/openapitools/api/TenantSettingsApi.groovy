package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.TenantSettings
import org.openapitools.model.UpdateTenantSettings

class TenantSettingsApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getTenantSettings ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/settings/tenant"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    TenantSettings.class )

    }

    def updateTenantSettings ( UpdateTenantSettings updateTenantSettings, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/settings/tenant"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (updateTenantSettings == null) {
            throw new RuntimeException("missing required params updateTenantSettings")
        }



        contentType = 'application/json';
        bodyParams = updateTenantSettings


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    TenantSettings.class )

    }

}
