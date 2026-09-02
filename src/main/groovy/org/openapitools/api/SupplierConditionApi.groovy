package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.SupplierCondition
import org.openapitools.model.SupplierConditionCreate
import org.openapitools.model.SupplierConditionUpdate

class SupplierConditionApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createSupplierCondition ( SupplierConditionCreate supplierConditionCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/supplier-conditions"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (supplierConditionCreate == null) {
            throw new RuntimeException("missing required params supplierConditionCreate")
        }



        contentType = 'application/json';
        bodyParams = supplierConditionCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    SupplierCondition.class )

    }

    def deleteSupplierCondition ( String supplierConditionId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/supplier-conditions/${supplier_condition_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (supplierConditionId == null) {
            throw new RuntimeException("missing required params supplierConditionId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    null )

    }

    def getSupplierCondition ( String supplierConditionId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/supplier-conditions/${supplier_condition_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (supplierConditionId == null) {
            throw new RuntimeException("missing required params supplierConditionId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    SupplierCondition.class )

    }

    def listSupplierConditions ( Integer page, Integer pageSize, String supplierContactId, String search, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/supplier-conditions/"

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
        if (supplierContactId != null) {
            queryParams.put("supplier_contact_id", supplierContactId)
        }
        if (search != null) {
            queryParams.put("search", search)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    SupplierCondition.class )

    }

    def updateSupplierCondition ( String supplierConditionId, SupplierConditionUpdate supplierConditionUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/supplier-conditions/${supplier_condition_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (supplierConditionId == null) {
            throw new RuntimeException("missing required params supplierConditionId")
        }
        // verify required params are set
        if (supplierConditionUpdate == null) {
            throw new RuntimeException("missing required params supplierConditionUpdate")
        }



        contentType = 'application/json';
        bodyParams = supplierConditionUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    SupplierCondition.class )

    }

}
