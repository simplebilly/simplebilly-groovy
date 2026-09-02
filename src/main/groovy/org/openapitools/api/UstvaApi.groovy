package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.JahresUstErgebnis
import org.openapitools.model.UstvaErgebnis

class UstvaApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def jahresustApi ( Integer year, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/jahresust"

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
                    JahresUstErgebnis.class )

    }

    def ustvaApi ( String zeitraum, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/ustva"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (zeitraum == null) {
            throw new RuntimeException("missing required params zeitraum")
        }

        if (zeitraum != null) {
            queryParams.put("zeitraum", zeitraum)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    UstvaErgebnis.class )

    }

}
