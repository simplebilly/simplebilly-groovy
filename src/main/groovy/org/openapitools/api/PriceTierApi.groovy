package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.PriceTier
import org.openapitools.model.PriceTierCreate
import org.openapitools.model.PriceTierUpdate
import org.openapitools.model.ResolvedPriceResponse
import java.util.UUID

class PriceTierApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createPriceTier ( PriceTierCreate priceTierCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/price-tiers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (priceTierCreate == null) {
            throw new RuntimeException("missing required params priceTierCreate")
        }



        contentType = 'application/json';
        bodyParams = priceTierCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PriceTier.class )

    }

    def deletePriceTier ( String priceTierId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/price-tiers/${price_tier_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (priceTierId == null) {
            throw new RuntimeException("missing required params priceTierId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getPriceTier ( String priceTierId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/price-tiers/${price_tier_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (priceTierId == null) {
            throw new RuntimeException("missing required params priceTierId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    PriceTier.class )

    }

    def getResolvedPrice ( UUID productId, Long quantity, String contactId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/price-tiers/resolved"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (productId == null) {
            throw new RuntimeException("missing required params productId")
        }

        if (productId != null) {
            queryParams.put("productId", productId)
        }
        if (quantity != null) {
            queryParams.put("quantity", quantity)
        }
        if (contactId != null) {
            queryParams.put("contactId", contactId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ResolvedPriceResponse.class )

    }

    def listPriceTiers ( Integer page, Integer pageSize, UUID productId, String customerGroupId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/price-tiers/"

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
        if (productId != null) {
            queryParams.put("product_id", productId)
        }
        if (customerGroupId != null) {
            queryParams.put("customer_group_id", customerGroupId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    PriceTier.class )

    }

    def updatePriceTier ( String priceTierId, PriceTierUpdate priceTierUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/price-tiers/${price_tier_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (priceTierId == null) {
            throw new RuntimeException("missing required params priceTierId")
        }
        // verify required params are set
        if (priceTierUpdate == null) {
            throw new RuntimeException("missing required params priceTierUpdate")
        }



        contentType = 'application/json';
        bodyParams = priceTierUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    PriceTier.class )

    }

}
