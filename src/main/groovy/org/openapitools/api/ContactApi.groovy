package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Contact
import org.openapitools.model.ContactTimelineResponse
import org.openapitools.model.PluginError
import org.openapitools.model.SalesVolumeReport

class ContactApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def contactSchema ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/contacts/schema"

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

    def contactTimeline ( String contactId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/contacts/${contact_id}/timeline"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (contactId == null) {
            throw new RuntimeException("missing required params contactId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    ContactTimelineResponse.class )

    }

    def createContact ( Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/contacts"

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
                    Contact.class )

    }

    def deleteContact ( String contactId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/contacts/${contact_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (contactId == null) {
            throw new RuntimeException("missing required params contactId")
        }





        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getContact ( String contactId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/contacts/${contact_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (contactId == null) {
            throw new RuntimeException("missing required params contactId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Contact.class )

    }

    def listContacts ( Integer page, Integer pageSize, String search, String contactType, String tag, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/contacts"

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
        if (contactType != null) {
            queryParams.put("contact_type", contactType)
        }
        if (tag != null) {
            queryParams.put("tag", tag)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    Contact.class )

    }

    def salesVolume ( Integer page, Integer pageSize, String search, String contactType, String tag, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/contacts/sales-volume"

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
        if (contactType != null) {
            queryParams.put("contact_type", contactType)
        }
        if (tag != null) {
            queryParams.put("tag", tag)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    SalesVolumeReport.class )

    }

    def updateContact ( String contactId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/contacts/${contact_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (contactId == null) {
            throw new RuntimeException("missing required params contactId")
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
                    Contact.class )

    }

}
