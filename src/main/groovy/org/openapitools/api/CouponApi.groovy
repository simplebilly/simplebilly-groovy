package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Coupon
import org.openapitools.model.CouponCreate
import org.openapitools.model.CouponUpdate
import org.openapitools.model.PluginError

class CouponApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def couponRestore ( String couponId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/coupons/${coupon_id}/restore"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (couponId == null) {
            throw new RuntimeException("missing required params couponId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Coupon.class )

    }

    def createCoupon ( CouponCreate couponCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/coupons"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (couponCreate == null) {
            throw new RuntimeException("missing required params couponCreate")
        }



        contentType = 'application/json';
        bodyParams = couponCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Coupon.class )

    }

    def deleteCoupon ( String couponId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/coupons/${coupon_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (couponId == null) {
            throw new RuntimeException("missing required params couponId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getCoupon ( String couponId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/coupons/${coupon_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (couponId == null) {
            throw new RuntimeException("missing required params couponId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Coupon.class )

    }

    def listCoupons ( Integer page, Integer pageSize, Boolean isActive, String code, String discountType, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/coupons/"

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
        if (isActive != null) {
            queryParams.put("is_active", isActive)
        }
        if (code != null) {
            queryParams.put("code", code)
        }
        if (discountType != null) {
            queryParams.put("discount_type", discountType)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    Coupon.class )

    }

    def updateCoupon ( String couponId, CouponUpdate couponUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/coupons/${coupon_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (couponId == null) {
            throw new RuntimeException("missing required params couponId")
        }
        // verify required params are set
        if (couponUpdate == null) {
            throw new RuntimeException("missing required params couponUpdate")
        }



        contentType = 'application/json';
        bodyParams = couponUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Coupon.class )

    }

}
