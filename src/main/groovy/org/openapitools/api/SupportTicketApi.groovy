package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.CreateTicketRequest
import org.openapitools.model.SupportTicket
import org.openapitools.model.SupportTicketUpdate
import java.util.UUID

class SupportTicketApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createTicketApi ( CreateTicketRequest createTicketRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/support/tickets"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (createTicketRequest == null) {
            throw new RuntimeException("missing required params createTicketRequest")
        }



        contentType = 'application/json';
        bodyParams = createTicketRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    SupportTicket.class )

    }

    def deleteTicketApi ( UUID ticketId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/support/tickets/${ticket_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (ticketId == null) {
            throw new RuntimeException("missing required params ticketId")
        }





        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getTicketApi ( UUID ticketId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/support/tickets/${ticket_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (ticketId == null) {
            throw new RuntimeException("missing required params ticketId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    SupportTicket.class )

    }

    def listTicketsApi ( String status, String priority, UUID assignedTo, String channelType, String customerId, String search, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/support/tickets"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (status != null) {
            queryParams.put("status", status)
        }
        if (priority != null) {
            queryParams.put("priority", priority)
        }
        if (assignedTo != null) {
            queryParams.put("assigned_to", assignedTo)
        }
        if (channelType != null) {
            queryParams.put("channel_type", channelType)
        }
        if (customerId != null) {
            queryParams.put("customer_id", customerId)
        }
        if (search != null) {
            queryParams.put("search", search)
        }
        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("page_size", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    SupportTicket.class )

    }

    def updateTicketApi ( UUID ticketId, SupportTicketUpdate supportTicketUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/support/tickets/${ticket_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (ticketId == null) {
            throw new RuntimeException("missing required params ticketId")
        }
        // verify required params are set
        if (supportTicketUpdate == null) {
            throw new RuntimeException("missing required params supportTicketUpdate")
        }



        contentType = 'application/json';
        bodyParams = supportTicketUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    SupportTicket.class )

    }

}
