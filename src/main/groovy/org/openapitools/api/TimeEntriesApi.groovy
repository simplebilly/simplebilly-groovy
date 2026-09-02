package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.LaborCostRow
import org.openapitools.model.PluginError
import org.openapitools.model.TimeEntryClockIn
import org.openapitools.model.TimeEntryClockOut
import org.openapitools.model.TimeEntryDto
import java.util.UUID

class TimeEntriesApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def clockInTimeEntry ( TimeEntryClockIn timeEntryClockIn, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/time-entries"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (timeEntryClockIn == null) {
            throw new RuntimeException("missing required params timeEntryClockIn")
        }



        contentType = 'application/json';
        bodyParams = timeEntryClockIn


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    TimeEntryDto.class )

    }

    def clockOutTimeEntry ( UUID id, TimeEntryClockOut timeEntryClockOut, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/time-entries/${id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (id == null) {
            throw new RuntimeException("missing required params id")
        }
        // verify required params are set
        if (timeEntryClockOut == null) {
            throw new RuntimeException("missing required params timeEntryClockOut")
        }



        contentType = 'application/json';
        bodyParams = timeEntryClockOut


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    TimeEntryDto.class )

    }

    def getLaborCosts ( Date from, Date to, String groupBy, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/labor-costs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (from == null) {
            throw new RuntimeException("missing required params from")
        }
        // verify required params are set
        if (to == null) {
            throw new RuntimeException("missing required params to")
        }
        // verify required params are set
        if (groupBy == null) {
            throw new RuntimeException("missing required params groupBy")
        }

        if (from != null) {
            queryParams.put("from", from)
        }
        if (to != null) {
            queryParams.put("to", to)
        }
        if (groupBy != null) {
            queryParams.put("group_by", groupBy)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    LaborCostRow.class )

    }

    def listTimeEntries ( Date from, Date to, Boolean active, UUID employeeId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/time-entries"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (from != null) {
            queryParams.put("from", from)
        }
        if (to != null) {
            queryParams.put("to", to)
        }
        if (active != null) {
            queryParams.put("active", active)
        }
        if (employeeId != null) {
            queryParams.put("employee_id", employeeId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    TimeEntryDto.class )

    }

}
