package org.openapitools.api;

import org.openapitools.api.ApiUtils
import org.openapitools.model.OpenItem

class ListOpenItemsApi {
    String basePath = "https://demo.simplebilly.com"
    String versionPath = ""
    ApiUtils apiUtils = new ApiUtils();

    def listOpenItemsApi ( Long reminderLevel1Days, Long reminderLevel2Days, Long reminderLevel3Days, String customerId, Closure onSuccess, Closure onFailure)  {
        String resourcePath = "/api/v1/bookkeeping/open-items"

        // params
        def queryParams = [:]
        def headerParams = [:]
        def bodyParams
        def accept
        def contentType


        if (reminderLevel1Days != null) {
            queryParams.put("reminder_level1_days", reminderLevel1Days)
        }
        if (reminderLevel2Days != null) {
            queryParams.put("reminder_level2_days", reminderLevel2Days)
        }
        if (reminderLevel3Days != null) {
            queryParams.put("reminder_level3_days", reminderLevel3Days)
        }
        if (customerId != null) {
            queryParams.put("customer_id", customerId)
        }




        accept = apiUtils.selectHeaderAccept(["application/json"])

        apiUtils.invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams, bodyParams, accept, contentType,
                    "GET", "array",
                    OpenItem.class )

    }

}
