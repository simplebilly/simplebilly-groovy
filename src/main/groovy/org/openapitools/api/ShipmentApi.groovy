package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CreateShipmentRequest
import org.openapitools.model.PluginError
import org.openapitools.model.Shipment
import org.openapitools.model.ShipmentStatusUpdate
import org.openapitools.model.TrackOrderRequest
import org.openapitools.model.TrackOrderResponse
import org.openapitools.model.TrackingInfo

class ShipmentApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createShipment ( Shipment shipment, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipments"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (shipment == null) {
            throw new RuntimeException("missing required params shipment")
        }



        contentType = 'application/json';
        bodyParams = shipment


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Shipment.class )

    }

    def createShipmentFromOrder ( String orderNumber, CreateShipmentRequest createShipmentRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/orders/${order_number}/shipments"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (orderNumber == null) {
            throw new RuntimeException("missing required params orderNumber")
        }
        // verify required params are set
        if (createShipmentRequest == null) {
            throw new RuntimeException("missing required params createShipmentRequest")
        }



        contentType = 'application/json';
        bodyParams = createShipmentRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Shipment.class )

    }

    def deleteShipment ( String shipmentId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipments/${shipment_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (shipmentId == null) {
            throw new RuntimeException("missing required params shipmentId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getShipment ( String shipmentId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipments/${shipment_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (shipmentId == null) {
            throw new RuntimeException("missing required params shipmentId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Shipment.class )

    }

    def listShipments ( Integer page, Integer pageSize, String search, Boolean includeDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipments"

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
        if (search != null) {
            queryParams.put("search", search)
        }
        if (includeDeleted != null) {
            queryParams.put("include_deleted", includeDeleted)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    Shipment.class )

    }

    def trackOrderPublic ( TrackOrderRequest trackOrderRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/public/track"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (trackOrderRequest == null) {
            throw new RuntimeException("missing required params trackOrderRequest")
        }



        contentType = 'application/json';
        bodyParams = trackOrderRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    TrackOrderResponse.class )

    }

    def trackShipmentApi ( String shipmentId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipments/${shipment_id}/tracking"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (shipmentId == null) {
            throw new RuntimeException("missing required params shipmentId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    TrackingInfo.class )

    }

    def updateShipmentStatus ( String shipmentId, ShipmentStatusUpdate shipmentStatusUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/shipments/${shipment_id}/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (shipmentId == null) {
            throw new RuntimeException("missing required params shipmentId")
        }
        // verify required params are set
        if (shipmentStatusUpdate == null) {
            throw new RuntimeException("missing required params shipmentStatusUpdate")
        }



        contentType = 'application/json';
        bodyParams = shipmentStatusUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Shipment.class )

    }

}
