package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.SmtpConfig

class OnlineshopApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getSmtpConfigApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/settings/smtp"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    SmtpConfig.class )

    }

    def saveSmtpConfigApi ( SmtpConfig smtpConfig, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/settings/smtp"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType




        contentType = 'application/json';
        bodyParams = smtpConfig


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    SmtpConfig.class )

    }

}
