package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.ShippingRule
import org.openapitools.model.ShippingRuleCreate
import org.openapitools.model.ShippingRuleUpdate

class ShippingRuleApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createShippingRule ( ShippingRuleCreate shippingRuleCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipping-rules"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (shippingRuleCreate == null) {
            throw new RuntimeException("missing required params shippingRuleCreate")
        }



        contentType = 'application/json';
        bodyParams = shippingRuleCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ShippingRule.class )

    }

    def deleteShippingRule ( String ruleId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipping-rules/${rule_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (ruleId == null) {
            throw new RuntimeException("missing required params ruleId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getShippingRule ( String ruleId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipping-rules/${rule_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (ruleId == null) {
            throw new RuntimeException("missing required params ruleId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ShippingRule.class )

    }

    def listShippingRules ( Integer page, Integer pageSize, String country, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipping-rules/"

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
        if (country != null) {
            queryParams.put("country", country)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    ShippingRule.class )

    }

    def updateShippingRule ( String ruleId, ShippingRuleUpdate shippingRuleUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipping-rules/${rule_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (ruleId == null) {
            throw new RuntimeException("missing required params ruleId")
        }
        // verify required params are set
        if (shippingRuleUpdate == null) {
            throw new RuntimeException("missing required params shippingRuleUpdate")
        }



        contentType = 'application/json';
        bodyParams = shippingRuleUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    ShippingRule.class )

    }

}
