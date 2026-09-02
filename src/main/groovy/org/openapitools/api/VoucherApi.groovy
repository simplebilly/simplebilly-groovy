package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.Voucher
import org.openapitools.model.VoucherCreate

class VoucherApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createVoucher ( VoucherCreate voucherCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/vouchers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (voucherCreate == null) {
            throw new RuntimeException("missing required params voucherCreate")
        }



        contentType = 'application/json';
        bodyParams = voucherCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Voucher.class )

    }

    def deleteVoucher ( String voucherId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/vouchers/${voucher_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (voucherId == null) {
            throw new RuntimeException("missing required params voucherId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getVoucher ( String voucherId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/vouchers/${voucher_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (voucherId == null) {
            throw new RuntimeException("missing required params voucherId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Voucher.class )

    }

    def listVouchers ( Integer page, Integer pageSize, String voucherType, String voucherStatus, String contactName, Date dateFrom, Date dateTo, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/vouchers/"

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
        if (voucherType != null) {
            queryParams.put("voucher_type", voucherType)
        }
        if (voucherStatus != null) {
            queryParams.put("voucher_status", voucherStatus)
        }
        if (contactName != null) {
            queryParams.put("contact_name", contactName)
        }
        if (dateFrom != null) {
            queryParams.put("date_from", dateFrom)
        }
        if (dateTo != null) {
            queryParams.put("date_to", dateTo)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    Voucher.class )

    }

    def updateVoucher ( String voucherId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/vouchers/${voucher_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (voucherId == null) {
            throw new RuntimeException("missing required params voucherId")
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
                    Voucher.class )

    }

    def voucherRestore ( String voucherId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/vouchers/${voucher_id}/restore"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (voucherId == null) {
            throw new RuntimeException("missing required params voucherId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Voucher.class )

    }

}
