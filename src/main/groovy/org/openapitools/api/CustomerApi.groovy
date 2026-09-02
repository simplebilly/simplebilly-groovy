package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Customer
import org.openapitools.model.CustomerCreate
import org.openapitools.model.CustomerUpdate
import org.openapitools.model.PluginError

class CustomerApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createCustomer ( CustomerCreate customerCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/customers"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (customerCreate == null) {
            throw new RuntimeException("missing required params customerCreate")
        }



        contentType = 'application/json';
        bodyParams = customerCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Customer.class )

    }

    def customerRestore ( String customerId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/customers/${customer_id}/restore"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (customerId == null) {
            throw new RuntimeException("missing required params customerId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    Customer.class )

    }

    def deleteCustomer ( String customerId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/customers/${customer_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (customerId == null) {
            throw new RuntimeException("missing required params customerId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getCustomer ( String customerId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/customers/${customer_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (customerId == null) {
            throw new RuntimeException("missing required params customerId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    Customer.class )

    }

    def getCustomers ( Integer page, Integer pageSize, String search, Boolean includeDeleted, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/customers/"

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
                    Customer.class )

    }

    def updateCustomer ( String customerId, CustomerUpdate customerUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/customers/${customer_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (customerId == null) {
            throw new RuntimeException("missing required params customerId")
        }
        // verify required params are set
        if (customerUpdate == null) {
            throw new RuntimeException("missing required params customerUpdate")
        }



        contentType = 'application/json';
        bodyParams = customerUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Customer.class )

    }

}
