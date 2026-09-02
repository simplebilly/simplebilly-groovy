package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PackingCompleteRequest
import org.openapitools.model.PackingCompleteResponse
import org.openapitools.model.PackingQueue
import org.openapitools.model.PackingVideoResponse
import org.openapitools.model.PluginError
import org.openapitools.model.PrintDeliveryNoteResponse
import org.openapitools.model.PrintLabelResponse

class PackingApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def completePacking ( String orderNumber, PackingCompleteRequest packingCompleteRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/packing/${order_number}/complete"

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
        if (packingCompleteRequest == null) {
            throw new RuntimeException("missing required params packingCompleteRequest")
        }



        contentType = 'application/json';
        bodyParams = packingCompleteRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PackingCompleteResponse.class )

    }

    def getPackingQueue ( Integer page, Integer pageSize, String search, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/packing/queue"

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




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    PackingQueue.class )

    }

    def printDeliveryNote ( String orderNumber, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/packing/${order_number}/print-delivery-note"

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





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PrintDeliveryNoteResponse.class )

    }

    def printLabel ( String orderNumber, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/packing/${order_number}/print-label"

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





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PrintLabelResponse.class )

    }

    def recordPackingVideo ( String orderNumber, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/packing/${order_number}/record-video"

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
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }



        contentType = 'application/json';
        bodyParams = body


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PackingVideoResponse.class )

    }

}
