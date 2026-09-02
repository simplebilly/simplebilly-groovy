package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Attachment
import org.openapitools.model.AttachmentVersion
import org.openapitools.model.NewVersionRequest
import org.openapitools.model.PluginError
import java.util.UUID

class AttachmentVersionApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createAttachmentVersion ( UUID attachmentId, NewVersionRequest newVersionRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/attachments/${attachment_id}/versions"

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
        if (newVersionRequest == null) {
            throw new RuntimeException("missing required params newVersionRequest")
        }



        contentType = 'application/json';
        bodyParams = newVersionRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    AttachmentVersion.class )

    }

    def listAttachmentVersions ( UUID attachmentId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/attachments/${attachment_id}/versions"

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





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    AttachmentVersion.class )

    }

    def restoreAttachmentVersion ( UUID attachmentId, UUID versionId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/attachments/${attachment_id}/versions/${version_id}/restore"

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
        if (versionId == null) {
            throw new RuntimeException("missing required params versionId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Attachment.class )

    }

}
