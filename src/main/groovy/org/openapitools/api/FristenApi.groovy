package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.FristenErgebnis

class FristenApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def fristenApi ( String bundesland, String voranmeldungsrhythmus, Boolean dauerfristverlaengerung, Boolean estAktiv, Boolean gewstAktiv, Integer monate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/fristen"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (bundesland != null) {
            queryParams.put("bundesland", bundesland)
        }
        if (voranmeldungsrhythmus != null) {
            queryParams.put("voranmeldungsrhythmus", voranmeldungsrhythmus)
        }
        if (dauerfristverlaengerung != null) {
            queryParams.put("dauerfristverlaengerung", dauerfristverlaengerung)
        }
        if (estAktiv != null) {
            queryParams.put("est_aktiv", estAktiv)
        }
        if (gewstAktiv != null) {
            queryParams.put("gewst_aktiv", gewstAktiv)
        }
        if (monate != null) {
            queryParams.put("monate", monate)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    FristenErgebnis.class )

    }

}
