package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Attachment
import org.openapitools.model.AttachmentCreate
import org.openapitools.model.OcrTextRequest
import org.openapitools.model.PluginError
import java.util.UUID

class AttachmentApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def attachmentRestore ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/attachments/${id}/restore"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Attachment.class )

    }

    def createAttachment ( AttachmentCreate attachmentCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/attachments"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (attachmentCreate == null) {
            throw new RuntimeException("missing required params attachmentCreate")
        }



        contentType = 'application/json';
        bodyParams = attachmentCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Attachment.class )

    }

    def deleteAttachment ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/attachments/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getAttachment ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/attachments/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Attachment.class )

    }

    def listAttachments ( Integer page, Integer pageSize, String contactId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/attachments/"

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
        if (contactId != null) {
            queryParams.put("contactId", contactId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    Attachment.class )

    }

    def saveAttachmentOcrText ( UUID attachmentId, OcrTextRequest ocrTextRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/attachments/${attachment_id}/ocr-text"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (attachmentId == null) {
            throw new RuntimeException("missing required params attachmentId")
        }
        // verify required params are set
        if (ocrTextRequest == null) {
            throw new RuntimeException("missing required params ocrTextRequest")
        }



        contentType = 'application/json';
        bodyParams = ocrTextRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Attachment.class )

    }

}
