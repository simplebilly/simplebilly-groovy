package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.ReorderProposalResponse

class ReorderProposalApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def applyReorderProposal ( Boolean configuredOnly, String warehouseId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/reorder-proposals/apply"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (configuredOnly != null) {
            queryParams.put("configuredOnly", configuredOnly)
        }
        if (warehouseId != null) {
            queryParams.put("warehouseId", warehouseId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Object.class )

    }

    def getReorderProposal ( Boolean configuredOnly, String warehouseId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/reorder-proposals"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (configuredOnly != null) {
            queryParams.put("configuredOnly", configuredOnly)
        }
        if (warehouseId != null) {
            queryParams.put("warehouseId", warehouseId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ReorderProposalResponse.class )

    }

}
