package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.DeliverableResponse
import org.openapitools.model.PluginError
import org.openapitools.model.ShippingThreshold
import org.openapitools.model.ShippingThresholdCreate
import org.openapitools.model.ShippingThresholdUpdate
import java.util.UUID

class ShippingThresholdApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createShippingThreshold ( ShippingThresholdCreate shippingThresholdCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipping-thresholds"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (shippingThresholdCreate == null) {
            throw new RuntimeException("missing required params shippingThresholdCreate")
        }



        contentType = 'application/json';
        bodyParams = shippingThresholdCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ShippingThreshold.class )

    }

    def deleteShippingThreshold ( String thresholdId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipping-thresholds/${threshold_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (thresholdId == null) {
            throw new RuntimeException("missing required params thresholdId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getDeliverable ( UUID productId, String warehouseId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipping-thresholds/deliverable"

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
        if (warehouseId != null) {
            queryParams.put("warehouseId", warehouseId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    DeliverableResponse.class )

    }

    def getShippingThreshold ( String thresholdId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipping-thresholds/${threshold_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (thresholdId == null) {
            throw new RuntimeException("missing required params thresholdId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ShippingThreshold.class )

    }

    def listShippingThresholds ( Integer page, Integer pageSize, UUID productId, String warehouseId, Boolean isActive, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipping-thresholds/"

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
        if (warehouseId != null) {
            queryParams.put("warehouse_id", warehouseId)
        }
        if (isActive != null) {
            queryParams.put("is_active", isActive)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    ShippingThreshold.class )

    }

    def updateShippingThreshold ( String thresholdId, ShippingThresholdUpdate shippingThresholdUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipping-thresholds/${threshold_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (thresholdId == null) {
            throw new RuntimeException("missing required params thresholdId")
        }
        // verify required params are set
        if (shippingThresholdUpdate == null) {
            throw new RuntimeException("missing required params shippingThresholdUpdate")
        }



        contentType = 'application/json';
        bodyParams = shippingThresholdUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    ShippingThreshold.class )

    }

}
