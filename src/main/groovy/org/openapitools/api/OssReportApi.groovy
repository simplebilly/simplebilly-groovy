package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.OssReport

class OssReportApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def ossReportApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/oss"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    OssReport.class )

    }

}
