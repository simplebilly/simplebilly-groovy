package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.QRCodeResponse

class GenerateQrcodeApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def generateQrcodeApi ( String iban, String id, String holderName, String bic, String amount, String reference, String purpose, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/invoices/${id}/qrcode"

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
        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }

        if (iban != null) {
            queryParams.put("iban", iban)
        }
        if (holderName != null) {
            queryParams.put("holder_name", holderName)
        }
        if (bic != null) {
            queryParams.put("bic", bic)
        }
        if (amount != null) {
            queryParams.put("amount", amount)
        }
        if (reference != null) {
            queryParams.put("reference", reference)
        }
        if (purpose != null) {
            queryParams.put("purpose", purpose)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    QRCodeResponse.class )

    }

}
