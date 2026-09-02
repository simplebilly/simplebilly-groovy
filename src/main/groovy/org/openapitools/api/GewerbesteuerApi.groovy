package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.GewerbesteuerErgebnis

class GewerbesteuerApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def gewerbesteuerApi ( Integer year, String hebesatz, String gewerbeertrag, String country, String gemeindeschluessel, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/gewerbesteuer"

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
        if (hebesatz != null) {
            queryParams.put("hebesatz", hebesatz)
        }
        if (gewerbeertrag != null) {
            queryParams.put("gewerbeertrag", gewerbeertrag)
        }
        if (country != null) {
            queryParams.put("country", country)
        }
        if (gemeindeschluessel != null) {
            queryParams.put("gemeindeschluessel", gemeindeschluessel)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    GewerbesteuerErgebnis.class )

    }

}
