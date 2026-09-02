package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CommunicationChannel
import org.openapitools.model.CommunicationDirection
import org.openapitools.model.ContactHistoryResponse
import org.openapitools.model.CustomerCommunication
import org.openapitools.model.CustomerCommunicationCreate
import org.openapitools.model.CustomerCommunicationUpdate
import org.openapitools.model.PluginError

class CustomerCommunicationApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createCommunication ( CustomerCommunicationCreate customerCommunicationCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/communications"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (customerCommunicationCreate == null) {
            throw new RuntimeException("missing required params customerCommunicationCreate")
        }



        contentType = 'application/json';
        bodyParams = customerCommunicationCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    CustomerCommunication.class )

    }

    def customercommunicationRestore ( String communicationId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/communications/${communication_id}/restore"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (communicationId == null) {
            throw new RuntimeException("missing required params communicationId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    CustomerCommunication.class )

    }

    def deleteCommunication ( String communicationId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/communications/${communication_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (communicationId == null) {
            throw new RuntimeException("missing required params communicationId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getCommunication ( String communicationId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/communications/${communication_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (communicationId == null) {
            throw new RuntimeException("missing required params communicationId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    CustomerCommunication.class )

    }

    def getContactHistory ( String contactId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/contacts/${contact_id}/communications"

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
                    ContactHistoryResponse.class )

    }

    def listCommunications ( Integer page, Integer pageSize, String contactId, CommunicationChannel channel, CommunicationDirection direction, Date from, Date to, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/communications/"

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
        if (contactId != null) {
            queryParams.put("contact_id", contactId)
        }
        if (channel != null) {
            queryParams.put("channel", channel)
        }
        if (direction != null) {
            queryParams.put("direction", direction)
        }
        if (from != null) {
            queryParams.put("from", from)
        }
        if (to != null) {
            queryParams.put("to", to)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    CustomerCommunication.class )

    }

    def updateCommunication ( String communicationId, CustomerCommunicationUpdate customerCommunicationUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/communications/${communication_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (communicationId == null) {
            throw new RuntimeException("missing required params communicationId")
        }
        // verify required params are set
        if (customerCommunicationUpdate == null) {
            throw new RuntimeException("missing required params customerCommunicationUpdate")
        }



        contentType = 'application/json';
        bodyParams = customerCommunicationUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    CustomerCommunication.class )

    }

}
