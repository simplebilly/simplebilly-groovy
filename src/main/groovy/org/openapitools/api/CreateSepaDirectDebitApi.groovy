package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.SepaDirectDebitResponse

class CreateSepaDirectDebitApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createSepaDirectDebitApi ( String creditorName, String creditorIban, String creditorId, String mandateId, String mandateDate, String debtorName, String debtorIban, String amount, String collectionDate, String creditorBic, String debtorBic, String description, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/sepa-direct-debit"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (creditorName == null) {
            throw new RuntimeException("missing required params creditorName")
        }
        // verify required params are set
        if (creditorIban == null) {
            throw new RuntimeException("missing required params creditorIban")
        }
        // verify required params are set
        if (creditorId == null) {
            throw new RuntimeException("missing required params creditorId")
        }
        // verify required params are set
        if (mandateId == null) {
            throw new RuntimeException("missing required params mandateId")
        }
        // verify required params are set
        if (mandateDate == null) {
            throw new RuntimeException("missing required params mandateDate")
        }
        // verify required params are set
        if (debtorName == null) {
            throw new RuntimeException("missing required params debtorName")
        }
        // verify required params are set
        if (debtorIban == null) {
            throw new RuntimeException("missing required params debtorIban")
        }
        // verify required params are set
        if (amount == null) {
            throw new RuntimeException("missing required params amount")
        }
        // verify required params are set
        if (collectionDate == null) {
            throw new RuntimeException("missing required params collectionDate")
        }

        if (creditorName != null) {
            queryParams.put("creditor_name", creditorName)
        }
        if (creditorIban != null) {
            queryParams.put("creditor_iban", creditorIban)
        }
        if (creditorBic != null) {
            queryParams.put("creditor_bic", creditorBic)
        }
        if (creditorId != null) {
            queryParams.put("creditor_id", creditorId)
        }
        if (mandateId != null) {
            queryParams.put("mandate_id", mandateId)
        }
        if (mandateDate != null) {
            queryParams.put("mandate_date", mandateDate)
        }
        if (debtorName != null) {
            queryParams.put("debtor_name", debtorName)
        }
        if (debtorIban != null) {
            queryParams.put("debtor_iban", debtorIban)
        }
        if (debtorBic != null) {
            queryParams.put("debtor_bic", debtorBic)
        }
        if (amount != null) {
            queryParams.put("amount", amount)
        }
        if (collectionDate != null) {
            queryParams.put("collection_date", collectionDate)
        }
        if (description != null) {
            queryParams.put("description", description)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    SepaDirectDebitResponse.class )

    }

}
