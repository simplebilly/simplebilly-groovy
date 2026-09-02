package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Lead
import org.openapitools.model.LeadUpdate
import java.util.UUID

class LeadApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def listLeadsApi ( String status, String source, String search, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/support/leads"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (status != null) {
            queryParams.put("status", status)
        }
        if (source != null) {
            queryParams.put("source", source)
        }
        if (search != null) {
            queryParams.put("search", search)
        }
        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    Lead.class )

    }

    def updateLeadApi ( UUID leadId, LeadUpdate leadUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/support/leads/${lead_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (leadId == null) {
            throw new RuntimeException("missing required params leadId")
        }
        // verify required params are set
        if (leadUpdate == null) {
            throw new RuntimeException("missing required params leadUpdate")
        }



        contentType = 'application/json';
        bodyParams = leadUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Lead.class )

    }

}
