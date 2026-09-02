package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.EmailTemplate
import org.openapitools.model.EmailTemplateCreate
import org.openapitools.model.EmailTemplateUpdate
import org.openapitools.model.PluginError

class EmailTemplateApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createEmailTemplate ( EmailTemplateCreate emailTemplateCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/email-templates"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (emailTemplateCreate == null) {
            throw new RuntimeException("missing required params emailTemplateCreate")
        }



        contentType = 'application/json';
        bodyParams = emailTemplateCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    EmailTemplate.class )

    }

    def deleteEmailTemplate ( String emailTemplateId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/email-templates/${email_template_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (emailTemplateId == null) {
            throw new RuntimeException("missing required params emailTemplateId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getEmailTemplate ( String emailTemplateId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/email-templates/${email_template_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (emailTemplateId == null) {
            throw new RuntimeException("missing required params emailTemplateId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    EmailTemplate.class )

    }

    def listEmailTemplates ( Integer page, Integer pageSize, String status, String search, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/email-templates/"

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
            queryParams.put("pageSize", pageSize)
        }
        if (status != null) {
            queryParams.put("status", status)
        }
        if (search != null) {
            queryParams.put("search", search)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    EmailTemplate.class )

    }

    def renderEmailTemplate ( String emailTemplateId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/email-templates/${email_template_id}/render"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (emailTemplateId == null) {
            throw new RuntimeException("missing required params emailTemplateId")
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

    def updateEmailTemplate ( String emailTemplateId, EmailTemplateUpdate emailTemplateUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/email-templates/${email_template_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (emailTemplateId == null) {
            throw new RuntimeException("missing required params emailTemplateId")
        }
        // verify required params are set
        if (emailTemplateUpdate == null) {
            throw new RuntimeException("missing required params emailTemplateUpdate")
        }



        contentType = 'application/json';
        bodyParams = emailTemplateUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    EmailTemplate.class )

    }

}
