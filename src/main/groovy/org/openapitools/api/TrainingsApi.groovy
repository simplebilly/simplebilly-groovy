package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.HrTrainingOverview
import org.openapitools.model.MyTrainingItem
import org.openapitools.model.PluginError
import org.openapitools.model.SubmitResultDto
import org.openapitools.model.SubmitResultResponse
import org.openapitools.model.TrainingContent

class TrainingsApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def getMyTrainings ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/trainings/me"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    MyTrainingItem.class )

    }

    def getTrainingContent ( String code, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/trainings/content/${code}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (code == null) {
            throw new RuntimeException("missing required params code")
        }





        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    TrainingContent.class )

    }

    def getTrainingOverview ( Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/trainings/overview"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType






        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    HrTrainingOverview.class )

    }

    def submitTrainingResult ( SubmitResultDto submitResultDto, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/trainings/submit-result"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (submitResultDto == null) {
            throw new RuntimeException("missing required params submitResultDto")
        }



        contentType = 'application/json';
        bodyParams = submitResultDto


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "POST", "",
                    SubmitResultResponse.class )

    }

}
