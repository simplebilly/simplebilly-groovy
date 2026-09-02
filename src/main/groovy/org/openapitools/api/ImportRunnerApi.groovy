package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ImportJobStatus
import org.openapitools.model.ImportStartRequest
import org.openapitools.model.ImportStartResponse
import org.openapitools.model.ImportTestRequest
import org.openapitools.model.ImportTestResponse
import org.openapitools.model.PluginError

class ImportRunnerApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getImportStatus ( String jobId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/import/${job_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (jobId == null) {
            throw new RuntimeException("missing required params jobId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ImportJobStatus.class )

    }

    def startImport ( ImportStartRequest importStartRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/import/start"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (importStartRequest == null) {
            throw new RuntimeException("missing required params importStartRequest")
        }



        contentType = 'application/json';
        bodyParams = importStartRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ImportStartResponse.class )

    }

    def testImportConnection ( ImportTestRequest importTestRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/import/test"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (importTestRequest == null) {
            throw new RuntimeException("missing required params importTestRequest")
        }



        contentType = 'application/json';
        bodyParams = importTestRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    ImportTestResponse.class )

    }

}
