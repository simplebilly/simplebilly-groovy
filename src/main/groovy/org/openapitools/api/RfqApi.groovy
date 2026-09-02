package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.Rfq
import org.openapitools.model.RfqStatusUpdate

class RfqApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def convertRfq ( String rfqId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/rfqs/${rfq_id}/convert"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (rfqId == null) {
            throw new RuntimeException("missing required params rfqId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Object.class )

    }

    def createRfq ( Rfq rfq, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/rfqs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (rfq == null) {
            throw new RuntimeException("missing required params rfq")
        }



        contentType = 'application/json';
        bodyParams = rfq


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Rfq.class )

    }

    def deleteRfq ( String rfqId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/rfqs/${rfq_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (rfqId == null) {
            throw new RuntimeException("missing required params rfqId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getRfq ( String rfqId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/rfqs/${rfq_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (rfqId == null) {
            throw new RuntimeException("missing required params rfqId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Rfq.class )

    }

    def listRfqs ( Integer page, Integer pageSize, String status, String supplierName, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/rfqs/"

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
        if (status != null) {
            queryParams.put("status", status)
        }
        if (supplierName != null) {
            queryParams.put("supplier_name", supplierName)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    Rfq.class )

    }

    def updateRfq ( String rfqId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/rfqs/${rfq_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (rfqId == null) {
            throw new RuntimeException("missing required params rfqId")
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
                    Rfq.class )

    }

    def updateRfqStatus ( String rfqId, RfqStatusUpdate rfqStatusUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/rfqs/${rfq_id}/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (rfqId == null) {
            throw new RuntimeException("missing required params rfqId")
        }
        // verify required params are set
        if (rfqStatusUpdate == null) {
            throw new RuntimeException("missing required params rfqStatusUpdate")
        }



        contentType = 'application/json';
        bodyParams = rfqStatusUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Rfq.class )

    }

}
