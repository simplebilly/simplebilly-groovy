package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.EventSubscription
import org.openapitools.model.PluginError

class EventSubscriptionApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createEventSubscription ( Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/event-subscriptions"

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
                    EventSubscription.class )

    }

    def deleteEventSubscription ( String subscriptionId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/event-subscriptions/${subscription_id}"

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





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def listEventSubscriptions ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/event-subscriptions/"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    EventSubscription.class )

    }

}
