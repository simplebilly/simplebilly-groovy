package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.OrderConfirmation
import org.openapitools.model.PluginError
import org.openapitools.model.Quotation
import org.openapitools.model.QuotationCreate

class QuotationApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createQuotation ( QuotationCreate quotationCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/quotations"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (quotationCreate == null) {
            throw new RuntimeException("missing required params quotationCreate")
        }



        contentType = 'application/json';
        bodyParams = quotationCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Quotation.class )

    }

    def deleteQuotation ( String quotationId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/quotations/${quotation_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (quotationId == null) {
            throw new RuntimeException("missing required params quotationId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def downloadQuotationPdf ( String quotationId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/quotations/${quotation_id}/pdf"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (quotationId == null) {
            throw new RuntimeException("missing required params quotationId")
        }





        accept = apiUtils.selectHeaderAccept(["application/pdf", "application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    null )

    }

    def getQuotation ( String quotationId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/quotations/${quotation_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (quotationId == null) {
            throw new RuntimeException("missing required params quotationId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Quotation.class )

    }

    def listQuotations ( Integer page, Integer pageSize, String search, Boolean includeDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/quotations/"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }
        if (search != null) {
            queryParams.put("search", search)
        }
        if (includeDeleted != null) {
            queryParams.put("include_deleted", includeDeleted)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    Quotation.class )

    }

    def pursueQuotation ( String quotationId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/quotations/${quotation_id}/pursue"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (quotationId == null) {
            throw new RuntimeException("missing required params quotationId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    OrderConfirmation.class )

    }

    def quotationRestore ( String quotationId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/quotations/${quotation_id}/restore"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (quotationId == null) {
            throw new RuntimeException("missing required params quotationId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Quotation.class )

    }

    def updateQuotation ( String quotationId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/quotations/${quotation_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (quotationId == null) {
            throw new RuntimeException("missing required params quotationId")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }



        contentType = 'application/json';
        bodyParams = body


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Quotation.class )

    }

}
