package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.KycRecord
import org.openapitools.model.KycRecordCreate
import org.openapitools.model.KycRecordUpdate
import org.openapitools.model.PluginError
import java.util.UUID

class KycRecordApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createKycRecord ( KycRecordCreate kycRecordCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/kyc-records"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (kycRecordCreate == null) {
            throw new RuntimeException("missing required params kycRecordCreate")
        }



        contentType = 'application/json';
        bodyParams = kycRecordCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    KycRecord.class )

    }

    def deleteKycRecord ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/kyc-records/${id}"

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

    def getKycRecord ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/kyc-records/${id}"

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
                    KycRecord.class )

    }

    def getKycRecords ( Integer page, Integer pageSize, String search, Boolean includeDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/kyc-records/"

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
                    KycRecord.class )

    }

    def updateKycRecord ( UUID id, KycRecordUpdate kycRecordUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/kyc-records/${id}"

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
        // verify required params are set
        if (kycRecordUpdate == null) {
            throw new RuntimeException("missing required params kycRecordUpdate")
        }



        contentType = 'application/json';
        bodyParams = kycRecordUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    KycRecord.class )

    }

}
