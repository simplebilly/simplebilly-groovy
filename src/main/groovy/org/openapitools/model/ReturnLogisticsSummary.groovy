package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ReturnWarehouseSummary;

@Canonical
class ReturnLogisticsSummary {
    /* Number of return orders per status. */
    Object byStatus = null
    /* Per-warehouse aggregation. */
    List<ReturnWarehouseSummary> byWarehouse = new ArrayList<>()
    /* Sum of `restock: true` line-item quantities. */
    Long itemsRestocked
    /* Sum of `restock: false` line-item quantities (scrapped/disposed). */
    Long itemsScrapped
    /* Sum of all line-item quantities across returns. */
    Long totalItems
    /* Total number of return orders (excluding soft-deleted). */
    Long totalReturns
}
