package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PosRegister
import org.openapitools.model.PosRegisterCreate
import org.openapitools.model.PosTable
import org.openapitools.model.PosTableCreate
import java.util.UUID

class PosApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def posBilling ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/pos/billing"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Object.class )

    }

    def posCreateOrder ( Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/pos/orders"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }



        contentType = 'application/json';
        bodyParams = body


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Object.class )

    }

    def posCreateRegister ( PosRegisterCreate posRegisterCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/pos/registers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (posRegisterCreate == null) {
            throw new RuntimeException("missing required params posRegisterCreate")
        }



        contentType = 'application/json';
        bodyParams = posRegisterCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PosRegister.class )

    }

    def posCreateTable ( PosTableCreate posTableCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/pos/tables"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (posTableCreate == null) {
            throw new RuntimeException("missing required params posTableCreate")
        }



        contentType = 'application/json';
        bodyParams = posTableCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PosTable.class )

    }

    def posDisableRegister ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/pos/registers/${id}/disable"

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





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PosRegister.class )

    }

    def posFreeTable ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/pos/tables/${id}/free"

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





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PosTable.class )

    }

    def posKasseClosing ( Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/pos/kasse/closing"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }



        contentType = 'application/json';
        bodyParams = body


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Object.class )

    }

    def posKasseEntries ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/pos/kasse/entries"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Object.class )

    }

    def posKasseExport ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/pos/kasse/export"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Object.class )

    }

    def posKassePayInOut ( Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/pos/kasse/pay-in-out"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }



        contentType = 'application/json';
        bodyParams = body


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Object.class )

    }

    def posListOrders ( String status, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/pos/orders"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (status != null) {
            queryParams.put("status", status)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Object.class )

    }

    def posListProducts ( String q, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/pos/products"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (q != null) {
            queryParams.put("q", q)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Object.class )

    }

    def posListRegisters ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/pos/registers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    PosRegister.class )

    }

    def posListTables ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/pos/tables"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    PosTable.class )

    }

    def posOrderPrint ( String orderNumber, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/pos/orders/${order_number}/print"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (orderNumber == null) {
            throw new RuntimeException("missing required params orderNumber")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Object.class )

    }

    def posOrderReceipt ( String orderNumber, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/pos/orders/${order_number}/receipt"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (orderNumber == null) {
            throw new RuntimeException("missing required params orderNumber")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Object.class )

    }

    def posPayOrder ( String orderNumber, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/pos/orders/${order_number}/pay"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (orderNumber == null) {
            throw new RuntimeException("missing required params orderNumber")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }



        contentType = 'application/json';
        bodyParams = body


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Object.class )

    }

    def posSumupCheckout ( Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/pos/sumup/checkout"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }



        contentType = 'application/json';
        bodyParams = body


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Object.class )

    }

}
