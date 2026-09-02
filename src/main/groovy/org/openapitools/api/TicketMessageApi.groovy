package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.SendMessageDto
import org.openapitools.model.TicketMessage
import java.util.UUID

class TicketMessageApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def listMessagesApi ( UUID ticketId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/support/tickets/${ticket_id}/messages"

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
                    "GET", "array",
                    TicketMessage.class )

    }

    def sendMessageApi ( UUID ticketId, SendMessageDto sendMessageDto, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/support/tickets/${ticket_id}/messages"

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
        if (sendMessageDto == null) {
            throw new RuntimeException("missing required params sendMessageDto")
        }



        contentType = 'application/json';
        bodyParams = sendMessageDto


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    TicketMessage.class )

    }

}
