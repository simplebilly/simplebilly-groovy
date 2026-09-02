package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.DeliveryNote
import org.openapitools.model.OrderConfirmation
import org.openapitools.model.OrderConfirmationCreate
import org.openapitools.model.PluginError

class OrderConfirmationApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createConfirmation ( OrderConfirmationCreate orderConfirmationCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/order-confirmations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (orderConfirmationCreate == null) {
            throw new RuntimeException("missing required params orderConfirmationCreate")
        }



        contentType = 'application/json';
        bodyParams = orderConfirmationCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    OrderConfirmation.class )

    }

    def deleteConfirmation ( String confirmationId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/order-confirmations/${confirmation_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (confirmationId == null) {
            throw new RuntimeException("missing required params confirmationId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def downloadConfirmationPdf ( String confirmationId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/order-confirmations/${confirmation_id}/pdf"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (confirmationId == null) {
            throw new RuntimeException("missing required params confirmationId")
        }





        accept = apiUtils.selectHeaderAccept(["application/pdf", "application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    null )

    }

    def getConfirmation ( String confirmationId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/order-confirmations/${confirmation_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (confirmationId == null) {
            throw new RuntimeException("missing required params confirmationId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    OrderConfirmation.class )

    }

    def listConfirmations ( Integer page, Integer pageSize, String search, Boolean includeDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/order-confirmations/"

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
                    OrderConfirmation.class )

    }

    def orderconfirmationRestore ( String confirmationId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/order-confirmations/${confirmation_id}/restore"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (confirmationId == null) {
            throw new RuntimeException("missing required params confirmationId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    OrderConfirmation.class )

    }

    def pursueConfirmation ( String confirmationId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/order-confirmations/${confirmation_id}/pursue"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (confirmationId == null) {
            throw new RuntimeException("missing required params confirmationId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    DeliveryNote.class )

    }

}
