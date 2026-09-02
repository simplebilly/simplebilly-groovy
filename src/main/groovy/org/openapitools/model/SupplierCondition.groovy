package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class SupplierCondition {
    /* Currency for the minimum order value. */
    String currency
    /* Incoterms, e.g. \"EXW\", \"DAP\". */
    String deliveryTerms
    /* Early-payment discount percentage (Skonto), e.g. 2.0. */
    String earlyPaymentDiscountPercent
    /* Is this the default condition for the supplier? */
    Boolean isDefault
    /* Minimum order value required for this supplier. */
    String minimumOrderValue
    
    String notes
    /* Number of days within which payment is due. */
    Integer paymentDueDays
    /* Payment terms, e.g. \"14 Tage, 2% Skonto\". */
    String paymentTerms
    /* The supplier this condition applies to (`contact_id`). References the supplier entity. */
    String supplierContactId
    /* The name of the supplier, denormalized for easy listing. */
    String supplierName
    /* Tiered discounts: JSON array of `{min_quantity, discount_percent}`. */
    Object volumeDiscountTiers = null
}
