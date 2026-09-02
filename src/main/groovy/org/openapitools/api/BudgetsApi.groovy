package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.Budget
import org.openapitools.model.BudgetErgebnis
import org.openapitools.model.BudgetGoalRequest
import org.openapitools.model.PluginError

class BudgetsApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def budgetsApi ( Integer year, Integer month, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/budgets"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (year == null) {
            throw new RuntimeException("missing required params year")
        }
        // verify required params are set
        if (month == null) {
            throw new RuntimeException("missing required params month")
        }

        if (year != null) {
            queryParams.put("year", year)
        }
        if (month != null) {
            queryParams.put("month", month)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "",
                    BudgetErgebnis.class )

    }

    def upsertBudgetGoalApi ( String category, BudgetGoalRequest budgetGoalRequest, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/budgets/goals/${category}"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType

        // verify required params are set
        if (category == null) {
            throw new RuntimeException("missing required params category")
        }
        // verify required params are set
        if (budgetGoalRequest == null) {
            throw new RuntimeException("missing required params budgetGoalRequest")
        }



        contentType = 'application/json';
        bodyParams = budgetGoalRequest


        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "PUT", "",
                    Budget.class )

    }

}
