package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.AppointmentStatusUpdate
import org.openapitools.model.DeliveryAppointment
import org.openapitools.model.DeliveryAppointmentCreate
import org.openapitools.model.PluginError
import org.openapitools.model.PublicDeliveryAppointmentRequest
import org.openapitools.model.PublicDeliveryAppointmentResponse
import org.openapitools.model.PublicDeliveryAppointmentStatusResponse

class DeliveryAppointmentApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createDeliveryAppointment ( DeliveryAppointmentCreate deliveryAppointmentCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-appointments"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (deliveryAppointmentCreate == null) {
            throw new RuntimeException("missing required params deliveryAppointmentCreate")
        }



        contentType = 'application/json';
        bodyParams = deliveryAppointmentCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    DeliveryAppointment.class )

    }

    def deleteDeliveryAppointment ( String appointmentId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-appointments/${appointment_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (appointmentId == null) {
            throw new RuntimeException("missing required params appointmentId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getDeliveryAppointment ( String appointmentId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-appointments/${appointment_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (appointmentId == null) {
            throw new RuntimeException("missing required params appointmentId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    DeliveryAppointment.class )

    }

    def getPublicDeliveryAppointmentStatus ( String appointmentId, String email, String token, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/public/delivery-appointments/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (appointmentId == null) {
            throw new RuntimeException("missing required params appointmentId")
        }
        // verify required params are set
        if (email == null) {
            throw new RuntimeException("missing required params email")
        }
        // verify required params are set
        if (token == null) {
            throw new RuntimeException("missing required params token")
        }

        if (appointmentId != null) {
            queryParams.put("appointmentId", appointmentId)
        }
        if (email != null) {
            queryParams.put("email", email)
        }
        if (token != null) {
            queryParams.put("token", token)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    PublicDeliveryAppointmentStatusResponse.class )

    }

    def listDeliveryAppointments ( Integer page, Integer pageSize, String status, String warehouseId, Date from, Date to, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-appointments"

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
        if (status != null) {
            queryParams.put("status", status)
        }
        if (warehouseId != null) {
            queryParams.put("warehouse_id", warehouseId)
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
                    DeliveryAppointment.class )

    }

    def requestPublicDeliveryAppointment ( PublicDeliveryAppointmentRequest publicDeliveryAppointmentRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/public/delivery-appointments/request"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (publicDeliveryAppointmentRequest == null) {
            throw new RuntimeException("missing required params publicDeliveryAppointmentRequest")
        }



        contentType = 'application/json';
        bodyParams = publicDeliveryAppointmentRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    PublicDeliveryAppointmentResponse.class )

    }

    def updateDeliveryAppointment ( String appointmentId, Object body, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-appointments/${appointment_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (appointmentId == null) {
            throw new RuntimeException("missing required params appointmentId")
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
                    DeliveryAppointment.class )

    }

    def updateDeliveryAppointmentStatus ( String appointmentId, AppointmentStatusUpdate appointmentStatusUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/delivery-appointments/${appointment_id}/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (appointmentId == null) {
            throw new RuntimeException("missing required params appointmentId")
        }
        // verify required params are set
        if (appointmentStatusUpdate == null) {
            throw new RuntimeException("missing required params appointmentStatusUpdate")
        }



        contentType = 'application/json';
        bodyParams = appointmentStatusUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    DeliveryAppointment.class )

    }

}
