package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.DeliveryDate
import org.openapitools.model.DeliveryDateCreate
import org.openapitools.model.DeliveryDateStatusUpdate
import org.openapitools.model.PluginError

class DeliveryDateApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createDeliveryDate ( DeliveryDateCreate deliveryDateCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-dates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (deliveryDateCreate == null) {
            throw new RuntimeException("missing required params deliveryDateCreate")
        }



        contentType = 'application/json';
        bodyParams = deliveryDateCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    DeliveryDate.class )

    }

    def deleteDeliveryDate ( String deliveryDateId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-dates/${delivery_date_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (deliveryDateId == null) {
            throw new RuntimeException("missing required params deliveryDateId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getDeliveryDate ( String deliveryDateId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-dates/${delivery_date_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (deliveryDateId == null) {
            throw new RuntimeException("missing required params deliveryDateId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    DeliveryDate.class )

    }

    def getDeliveryPerformance ( Integer page, Integer pageSize, String orderNumber, String status, Date from, Date to, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-dates/performance"

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
            queryParams.put("pageSize", pageSize)
        }
        if (orderNumber != null) {
            queryParams.put("orderNumber", orderNumber)
        }
        if (status != null) {
            queryParams.put("status", status)
        }
        if (from != null) {
            queryParams.put("from", from)
        }
        if (to != null) {
            queryParams.put("to", to)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Object.class )

    }

    def listDeliveryDates ( Integer page, Integer pageSize, String orderNumber, String status, Date from, Date to, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-dates/"

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
            queryParams.put("pageSize", pageSize)
        }
        if (orderNumber != null) {
            queryParams.put("orderNumber", orderNumber)
        }
        if (status != null) {
            queryParams.put("status", status)
        }
        if (from != null) {
            queryParams.put("from", from)
        }
        if (to != null) {
            queryParams.put("to", to)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    DeliveryDate.class )

    }

    def updateDeliveryDate ( String deliveryDateId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-dates/${delivery_date_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (deliveryDateId == null) {
            throw new RuntimeException("missing required params deliveryDateId")
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
                    DeliveryDate.class )

    }

    def updateDeliveryDateStatus ( String deliveryDateId, DeliveryDateStatusUpdate deliveryDateStatusUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-dates/${delivery_date_id}/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (deliveryDateId == null) {
            throw new RuntimeException("missing required params deliveryDateId")
        }
        // verify required params are set
        if (deliveryDateStatusUpdate == null) {
            throw new RuntimeException("missing required params deliveryDateStatusUpdate")
        }



        contentType = 'application/json';
        bodyParams = deliveryDateStatusUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    DeliveryDate.class )

    }

}
