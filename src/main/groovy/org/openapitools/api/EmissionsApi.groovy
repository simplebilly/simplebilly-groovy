package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CreateEmissionEntry
import org.openapitools.model.CreateEmissionTarget
import org.openapitools.model.EmissionEntry
import org.openapitools.model.EmissionFactorResponse
import org.openapitools.model.EmissionTarget
import org.openapitools.model.EmissionsExportResponse
import org.openapitools.model.EmissionsReport
import org.openapitools.model.PluginError
import java.util.UUID

class EmissionsApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createEmissionEntryApi ( CreateEmissionEntry createEmissionEntry, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/emissions/entries"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (createEmissionEntry == null) {
            throw new RuntimeException("missing required params createEmissionEntry")
        }



        contentType = 'application/json';
        bodyParams = createEmissionEntry


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    EmissionEntry.class )

    }

    def createEmissionTargetApi ( CreateEmissionTarget createEmissionTarget, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/emissions/targets"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (createEmissionTarget == null) {
            throw new RuntimeException("missing required params createEmissionTarget")
        }



        contentType = 'application/json';
        bodyParams = createEmissionTarget


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    EmissionTarget.class )

    }

    def deleteEmissionEntryApi ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/emissions/entries/${id}"

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

    def deleteEmissionTargetApi ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/emissions/targets/${id}"

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

    def emissionsEntriesApi ( Integer year, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/emissions/entries"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (year == null) {
            throw new RuntimeException("missing required params year")
        }

        if (year != null) {
            queryParams.put("year", year)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    EmissionEntry.class )

    }

    def emissionsExportApi ( Integer year, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/emissions/export"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (year == null) {
            throw new RuntimeException("missing required params year")
        }

        if (year != null) {
            queryParams.put("year", year)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    EmissionsExportResponse.class )

    }

    def emissionsFactorsApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/emissions/factors"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    EmissionFactorResponse.class )

    }

    def emissionsReportApi ( Integer year, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/emissions/report"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (year == null) {
            throw new RuntimeException("missing required params year")
        }

        if (year != null) {
            queryParams.put("year", year)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    EmissionsReport.class )

    }

    def emissionsTargetsApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/emissions/targets"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    EmissionTarget.class )

    }

}
