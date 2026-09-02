package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CreateSubscriptionRequest
import org.openapitools.model.EmitEventRequest
import org.openapitools.model.PluginError
import org.openapitools.model.UpdateSubscriptionRequest
import org.openapitools.model.WebhookEvent
import org.openapitools.model.WebhookSubscription

class WebhooksApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createSubscription ( CreateSubscriptionRequest createSubscriptionRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/webhook-subscriptions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (createSubscriptionRequest == null) {
            throw new RuntimeException("missing required params createSubscriptionRequest")
        }



        contentType = 'application/json';
        bodyParams = createSubscriptionRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    WebhookSubscription.class )

    }

    def deleteSubscription ( String subscriptionId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/webhook-subscriptions/${subscription_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (subscriptionId == null) {
            throw new RuntimeException("missing required params subscriptionId")
        }





        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def emitApi ( EmitEventRequest emitEventRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/webhooks/emit"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (emitEventRequest == null) {
            throw new RuntimeException("missing required params emitEventRequest")
        }



        contentType = 'application/json';
        bodyParams = emitEventRequest


        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

    def listEvent ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/webhook-events"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    WebhookEvent.class )

    }

    def listSubscriptions ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/webhook-subscriptions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    WebhookSubscription.class )

    }

    def updateSubscription ( String subscriptionId, UpdateSubscriptionRequest updateSubscriptionRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/webhook-subscriptions/${subscription_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (subscriptionId == null) {
            throw new RuntimeException("missing required params subscriptionId")
        }
        // verify required params are set
        if (updateSubscriptionRequest == null) {
            throw new RuntimeException("missing required params updateSubscriptionRequest")
        }



        contentType = 'application/json';
        bodyParams = updateSubscriptionRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    WebhookSubscription.class )

    }

}
