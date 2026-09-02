package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.DeliveryDateStatus;

@Canonical
class DeliveryDate {
    /* References the customer entity. */
    String customerId
    /* Date actually delivered (set on fulfillment). */
    Date fulfilledDate
    
    String note
    /* Sales order number (`order.order_number`). */
    String orderNumber
    /* Original date promised before rescheduling. */
    Date originalDate
    /* Product line item this date applies to, if per-item. References the product entity. */
    String productId
    /* Date promised to the customer. */
    Date promisedDate
    /* One of: promised | confirmed | rescheduled | fulfilled | late | cancelled */
    DeliveryDateStatus status
}
