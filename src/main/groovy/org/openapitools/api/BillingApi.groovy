package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApiResponseSubscriptionOverview
import org.openapitools.model.ApiResponseVecPlan
import org.openapitools.model.QuotaOverride

class BillingApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getPlans ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/plans"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ApiResponseVecPlan.class )

    }

    def getQuotaApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/quota"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    null )

    }

    def getSubscriptionApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/subscription"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ApiResponseSubscriptionOverview.class )

    }

    def getUsageApi ( String meter, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/usage"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (meter != null) {
            queryParams.put("meter", meter)
        }




        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    null )

    }

    def paddleSubscriptionWebhook ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/webhooks/paddle/subscription"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

    def putQuotaApi ( QuotaOverride quotaOverride, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/quota"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (quotaOverride == null) {
            throw new RuntimeException("missing required params quotaOverride")
        }



        contentType = 'application/json';
        bodyParams = quotaOverride


        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    null )

    }

}
