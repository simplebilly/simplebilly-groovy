package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Employee
import org.openapitools.model.EmployeeCreate
import org.openapitools.model.EmployeeUpdate
import org.openapitools.model.PayrollSummary
import org.openapitools.model.PluginError
import java.util.UUID

class EmployeeApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createEmployee ( EmployeeCreate employeeCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/employees"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (employeeCreate == null) {
            throw new RuntimeException("missing required params employeeCreate")
        }



        contentType = 'application/json';
        bodyParams = employeeCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Employee.class )

    }

    def deleteEmployee ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/employees/${id}"

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





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def employeeRestore ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/employees/${id}/restore"

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





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Employee.class )

    }

    def getEmployee ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/employees/${id}"

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





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Employee.class )

    }

    def getEmployeePayrollSummary ( UUID id, Integer year, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/employees/${id}/payroll-summary"

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

        if (year != null) {
            queryParams.put("year", year)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    PayrollSummary.class )

    }

    def getEmployees ( Integer page, Integer pageSize, String search, Boolean includeDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/employees/"

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
        if (includeDeleted != null) {
            queryParams.put("include_deleted", includeDeleted)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    Employee.class )

    }

    def updateEmployee ( UUID id, EmployeeUpdate employeeUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/employees/${id}"

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
        if (employeeUpdate == null) {
            throw new RuntimeException("missing required params employeeUpdate")
        }



        contentType = 'application/json';
        bodyParams = employeeUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Employee.class )

    }

}
