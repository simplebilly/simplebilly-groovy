package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.ApplicationStatusDto
import org.openapitools.model.JobApplication
import org.openapitools.model.PublicPosting
import java.util.UUID

class JobApplicationApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def applyPublic ( UUID postingId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/public/jobs/${posting_id}/apply"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (postingId == null) {
            throw new RuntimeException("missing required params postingId")
        }





        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

    def deleteJobApplication ( UUID applicationId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/job-applications/${application_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (applicationId == null) {
            throw new RuntimeException("missing required params applicationId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "DELETE", "",
                    JobApplication.class )

    }

    def downloadCv ( UUID applicationId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/job-applications/${application_id}/cv"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (applicationId == null) {
            throw new RuntimeException("missing required params applicationId")
        }





        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    null )

    }

    def getJobApplication ( UUID applicationId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/job-applications/${application_id}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (applicationId == null) {
            throw new RuntimeException("missing required params applicationId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    JobApplication.class )

    }

    def inboundEmail ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/public/jobs/inbound-email"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept([])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    null )

    }

    def listJobApplications ( UUID postingId, String status, Integer page, Integer pageSize, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/job-applications"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (postingId != null) {
            queryParams.put("postingId", postingId)
        }
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
                    JobApplication.class )

    }

    def listPublicPostings ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/public/jobs"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    PublicPosting.class )

    }

    def scoreJobApplication ( UUID applicationId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/job-applications/${application_id}/score"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (applicationId == null) {
            throw new RuntimeException("missing required params applicationId")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    JobApplication.class )

    }

    def updateJobApplicationStatus ( UUID applicationId, ApplicationStatusDto applicationStatusDto, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/job-applications/${application_id}/status"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (applicationId == null) {
            throw new RuntimeException("missing required params applicationId")
        }
        // verify required params are set
        if (applicationStatusDto == null) {
            throw new RuntimeException("missing required params applicationStatusDto")
        }



        contentType = 'application/json';
        bodyParams = applicationStatusDto


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PATCH", "",
                    JobApplication.class )

    }

}
