package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ProposedAssignment

class ProposeAssignmentsApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def proposeAssignmentsApi ( Double minConfidence, String customerId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/propose-assignments"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (minConfidence != null) {
            queryParams.put("min_confidence", minConfidence)
        }
        if (customerId != null) {
            queryParams.put("customer_id", customerId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    ProposedAssignment.class )

    }

}
