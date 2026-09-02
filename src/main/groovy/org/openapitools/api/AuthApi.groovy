package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AcceptInviteRequest
import org.openapitools.model.AuthResponse
import org.openapitools.model.ForgotPasswordRequest
import org.openapitools.model.LoginRequest
import org.openapitools.model.MagicLinkRequest
import org.openapitools.model.MagicLinkVerifyRequest
import org.openapitools.model.RegisterRequest
import org.openapitools.model.ResetPasswordRequest
import org.openapitools.model.TotpEnableRequest
import org.openapitools.model.TotpSetupResponse
import org.openapitools.model.VerifyEmailRequest

class AuthApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def acceptInvite ( AcceptInviteRequest acceptInviteRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/auth/accept-invite"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (acceptInviteRequest == null) {
            throw new RuntimeException("missing required params acceptInviteRequest")
        }



        contentType = 'application/json';
        bodyParams = acceptInviteRequest


        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

    def forgotPassword ( ForgotPasswordRequest forgotPasswordRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/auth/forgot-password"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (forgotPasswordRequest == null) {
            throw new RuntimeException("missing required params forgotPasswordRequest")
        }



        contentType = 'application/json';
        bodyParams = forgotPasswordRequest


        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

    def login ( LoginRequest loginRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/auth/login"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (loginRequest == null) {
            throw new RuntimeException("missing required params loginRequest")
        }



        contentType = 'application/json';
        bodyParams = loginRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    AuthResponse.class )

    }

    def logout ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/auth/logout"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

    def magicLinkLogin ( MagicLinkRequest magicLinkRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/auth/magic-link"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (magicLinkRequest == null) {
            throw new RuntimeException("missing required params magicLinkRequest")
        }



        contentType = 'application/json';
        bodyParams = magicLinkRequest


        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

    def magicLinkVerify ( MagicLinkVerifyRequest magicLinkVerifyRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/auth/magic-link/verify"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (magicLinkVerifyRequest == null) {
            throw new RuntimeException("missing required params magicLinkVerifyRequest")
        }



        contentType = 'application/json';
        bodyParams = magicLinkVerifyRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    AuthResponse.class )

    }

    def register ( RegisterRequest registerRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/auth/register"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (registerRequest == null) {
            throw new RuntimeException("missing required params registerRequest")
        }



        contentType = 'application/json';
        bodyParams = registerRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    AuthResponse.class )

    }

    def resetPassword ( ResetPasswordRequest resetPasswordRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/auth/reset-password"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (resetPasswordRequest == null) {
            throw new RuntimeException("missing required params resetPasswordRequest")
        }



        contentType = 'application/json';
        bodyParams = resetPasswordRequest


        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

    def totpEnable ( TotpEnableRequest totpEnableRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/auth/totp/enable"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (totpEnableRequest == null) {
            throw new RuntimeException("missing required params totpEnableRequest")
        }



        contentType = 'application/json';
        bodyParams = totpEnableRequest


        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

    def totpSetup ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/auth/totp/setup"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    TotpSetupResponse.class )

    }

    def verifyEmail ( VerifyEmailRequest verifyEmailRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/auth/verify-email"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (verifyEmailRequest == null) {
            throw new RuntimeException("missing required params verifyEmailRequest")
        }



        contentType = 'application/json';
        bodyParams = verifyEmailRequest


        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

}
