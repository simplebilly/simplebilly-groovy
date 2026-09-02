package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.GatewayOAuthAuthorizeRequest
import org.openapitools.model.GatewayOAuthAuthorizeResponse
import org.openapitools.model.GatewayOAuthCallbackRequest
import org.openapitools.model.PaymentGateway
import org.openapitools.model.PluginError

class PaymentGatewayApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createPaymentGatewayApi ( Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payment-gateways"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }



        contentType = 'application/json';
        bodyParams = body


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PaymentGateway.class )

    }

    def deletePaymentGatewayApi ( String gatewayId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payment-gateways/${gateway_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (gatewayId == null) {
            throw new RuntimeException("missing required params gatewayId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def listPaymentGatewaysApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payment-gateways/"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    PaymentGateway.class )

    }

    def oauthAuthorizeApi ( GatewayOAuthAuthorizeRequest gatewayOAuthAuthorizeRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payment-gateways/oauth/authorize"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (gatewayOAuthAuthorizeRequest == null) {
            throw new RuntimeException("missing required params gatewayOAuthAuthorizeRequest")
        }



        contentType = 'application/json';
        bodyParams = gatewayOAuthAuthorizeRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    GatewayOAuthAuthorizeResponse.class )

    }

    def oauthCallbackApi ( GatewayOAuthCallbackRequest gatewayOAuthCallbackRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payment-gateways/oauth/callback"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (gatewayOAuthCallbackRequest == null) {
            throw new RuntimeException("missing required params gatewayOAuthCallbackRequest")
        }



        contentType = 'application/json';
        bodyParams = gatewayOAuthCallbackRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PaymentGateway.class )

    }

    def updatePaymentGatewayApi ( String gatewayId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/payment-gateways/${gateway_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (gatewayId == null) {
            throw new RuntimeException("missing required params gatewayId")
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
                    PaymentGateway.class )

    }

}
