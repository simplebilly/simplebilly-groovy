package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.LegalDocument
import org.openapitools.model.LegalDocumentReset
import org.openapitools.model.LegalDocumentUpsert
import org.openapitools.model.PluginError

class LegalDocumentApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getLegalDocuments ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/legal/documents"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    LegalDocument.class )

    }

    def resetLegalDocuments ( LegalDocumentReset legalDocumentReset, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/legal/documents/reset"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (legalDocumentReset == null) {
            throw new RuntimeException("missing required params legalDocumentReset")
        }



        contentType = 'application/json';
        bodyParams = legalDocumentReset


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "array",
                    LegalDocument.class )

    }

    def upsertLegalDocuments ( List<LegalDocumentUpsert> legalDocumentUpsert, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/legal/documents"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (legalDocumentUpsert == null) {
            throw new RuntimeException("missing required params legalDocumentUpsert")
        }



        contentType = 'application/json';
        bodyParams = legalDocumentUpsert


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "array",
                    LegalDocument.class )

    }

}
