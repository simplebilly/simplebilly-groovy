package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.BankLookup
import org.openapitools.model.HebesatzLookup

class BankingApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def bankLookupApi ( String iban, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/banking/lookup"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (iban == null) {
            throw new RuntimeException("missing required params iban")
        }

        if (iban != null) {
            queryParams.put("iban", iban)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    BankLookup.class )

    }

    def bankTransactionsApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/banking/transactions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    null )

    }

    def hebesatzLookupApi ( String gemeindeschluessel, String plz, String name, String stichtag, String countryCode, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/hebesatz"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (gemeindeschluessel != null) {
            queryParams.put("gemeindeschluessel", gemeindeschluessel)
        }
        if (plz != null) {
            queryParams.put("plz", plz)
        }
        if (name != null) {
            queryParams.put("name", name)
        }
        if (stichtag != null) {
            queryParams.put("stichtag", stichtag)
        }
        if (countryCode != null) {
            queryParams.put("country_code", countryCode)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    HebesatzLookup.class )

    }

}
