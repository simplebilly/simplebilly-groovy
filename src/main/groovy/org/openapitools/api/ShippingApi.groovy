package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.ProviderInfo
import org.openapitools.model.RateRequest
import org.openapitools.model.RateResponse
import org.openapitools.model.ShippingCredentials

class ShippingApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getCredentialsApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipping/credentials"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ShippingCredentials.class )

    }

    def getRatesApi ( RateRequest rateRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipping/rates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (rateRequest == null) {
            throw new RuntimeException("missing required params rateRequest")
        }



        contentType = 'application/json';
        bodyParams = rateRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    RateResponse.class )

    }

    def listProvidersApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipping/providers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    ProviderInfo.class )

    }

    def saveCredentialsApi ( ShippingCredentials shippingCredentials, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipping/credentials"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (shippingCredentials == null) {
            throw new RuntimeException("missing required params shippingCredentials")
        }



        contentType = 'application/json';
        bodyParams = shippingCredentials


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    ShippingCredentials.class )

    }

}
