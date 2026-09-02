package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.JobPosting
import org.openapitools.model.JobPostingCreate
import org.openapitools.model.JobPostingUpdate
import org.openapitools.model.PluginError
import java.util.UUID

class JobPostingApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def createJobPosting ( JobPostingCreate jobPostingCreate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/job-postings"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (jobPostingCreate == null) {
            throw new RuntimeException("missing required params jobPostingCreate")
        }



        contentType = 'application/json';
        bodyParams = jobPostingCreate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    JobPosting.class )

    }

    def deleteJobPosting ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/job-postings/${id}"

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

    def getJobPosting ( UUID id, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/job-postings/${id}"

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
                    JobPosting.class )

    }

    def listJobPostings ( String status, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/job-postings"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (status != null) {
            queryParams.put("status", status)
        }
        if (page != null) {
            queryParams.put("page", page)
        }
        if (pageSize != null) {
            queryParams.put("pageSize", pageSize)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    JobPosting.class )

    }

    def updateJobPosting ( UUID id, JobPostingUpdate jobPostingUpdate, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/job-postings/${id}"

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
        if (jobPostingUpdate == null) {
            throw new RuntimeException("missing required params jobPostingUpdate")
        }



        contentType = 'application/json';
        bodyParams = jobPostingUpdate


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    JobPosting.class )

    }

}
