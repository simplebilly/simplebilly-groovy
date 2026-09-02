package org.openapitools.api;

import org.openapitools.api.ApiUtils

class ZugferdApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def generateZugferdApi ( String id, String supplierName, String supplierStreet, String supplierCity, String supplierZip, String supplierCountry, String supplierVatId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/invoices/${id}/zugferd"

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

        if (supplierName != null) {
            queryParams.put("supplier_name", supplierName)
        }
        if (supplierStreet != null) {
            queryParams.put("supplier_street", supplierStreet)
        }
        if (supplierCity != null) {
            queryParams.put("supplier_city", supplierCity)
        }
        if (supplierZip != null) {
            queryParams.put("supplier_zip", supplierZip)
        }
        if (supplierCountry != null) {
            queryParams.put("supplier_country", supplierCountry)
        }
        if (supplierVatId != null) {
            queryParams.put("supplier_vat_id", supplierVatId)
        }




        accept = apiUtils.selectHeaderAccept(["application/pdf"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    null )

    }

}
