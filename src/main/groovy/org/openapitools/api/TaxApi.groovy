package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.TaxRateCreate
import java.util.UUID

class TaxApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createTaxRate ( TaxRateCreate taxRateCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/tax-rates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (taxRateCreate == null) {
            throw new RuntimeException("missing required params taxRateCreate")
        }



        contentType = 'application/json';
        bodyParams = taxRateCreate


        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

    def deleteTaxRate ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/tax-rates/${id}"

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





        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def listTaxRates ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/tax-rates"

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

    def updateTaxRate ( UUID id, TaxRateCreate taxRateCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/tax-rates/${id}"

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
        // verify required params are set
        if (taxRateCreate == null) {
            throw new RuntimeException("missing required params taxRateCreate")
        }



        contentType = 'application/json';
        bodyParams = taxRateCreate


        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    null )

    }

}
