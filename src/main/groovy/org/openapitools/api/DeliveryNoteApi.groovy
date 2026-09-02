package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.DeliveryNote
import org.openapitools.model.DeliveryNoteCreate
import org.openapitools.model.Invoice
import org.openapitools.model.PluginError

class DeliveryNoteApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createDeliveryNote ( DeliveryNoteCreate deliveryNoteCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-notes"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (deliveryNoteCreate == null) {
            throw new RuntimeException("missing required params deliveryNoteCreate")
        }



        contentType = 'application/json';
        bodyParams = deliveryNoteCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    DeliveryNote.class )

    }

    def deleteDeliveryNote ( String deliveryNoteId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-notes/${delivery_note_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (deliveryNoteId == null) {
            throw new RuntimeException("missing required params deliveryNoteId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def deliverynoteRestore ( String deliveryNoteId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-notes/${delivery_note_id}/restore"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (deliveryNoteId == null) {
            throw new RuntimeException("missing required params deliveryNoteId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    DeliveryNote.class )

    }

    def downloadDeliveryNotePdf ( String deliveryNoteId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-notes/${delivery_note_id}/pdf"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (deliveryNoteId == null) {
            throw new RuntimeException("missing required params deliveryNoteId")
        }





        accept = apiUtils.selectHeaderAccept(["application/pdf", "application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    null )

    }

    def getDeliveryNote ( String deliveryNoteId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-notes/${delivery_note_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (deliveryNoteId == null) {
            throw new RuntimeException("missing required params deliveryNoteId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    DeliveryNote.class )

    }

    def listDeliveryNotes ( Integer page, Integer pageSize, String search, Boolean includeDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-notes/"

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
                    DeliveryNote.class )

    }

    def pursueDeliveryNote ( String deliveryNoteId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-notes/${delivery_note_id}/pursue"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (deliveryNoteId == null) {
            throw new RuntimeException("missing required params deliveryNoteId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Invoice.class )

    }

}
