package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.PluginError
import org.openapitools.model.Workflow
import org.openapitools.model.WorkflowEnabledUpdate

class WorkflowsApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def listWorkflowsApi ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/workflows"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    Workflow.class )

    }

    def setWorkflowEnabledApi ( String workflowId, WorkflowEnabledUpdate workflowEnabledUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/workflows/${workflow_id}/enabled"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (workflowId == null) {
            throw new RuntimeException("missing required params workflowId")
        }
        // verify required params are set
        if (workflowEnabledUpdate == null) {
            throw new RuntimeException("missing required params workflowEnabledUpdate")
        }



        contentType = 'application/json';
        bodyParams = workflowEnabledUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Workflow.class )

    }

}
