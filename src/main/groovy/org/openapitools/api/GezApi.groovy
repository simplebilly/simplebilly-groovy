package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.GezReport

class GezApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def gezApi ( Integer jahr, String betriebsstaetten, Long kfz, Long hotelzimmer, Long beschaefigte, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/gez"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (jahr != null) {
            queryParams.put("jahr", jahr)
        }
        if (betriebsstaetten != null) {
            queryParams.put("betriebsstaetten", betriebsstaetten)
        }
        if (kfz != null) {
            queryParams.put("kfz", kfz)
        }
        if (hotelzimmer != null) {
            queryParams.put("hotelzimmer", hotelzimmer)
        }
        if (beschaefigte != null) {
            queryParams.put("beschaefigte", beschaefigte)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    GezReport.class )

    }

}
