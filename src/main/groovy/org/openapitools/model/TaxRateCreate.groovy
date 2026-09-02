package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class TaxRateCreate {
    /* ISO 3166-1 alpha-2 country code. */
    String countryCode
    /* Date this rate took effect; `None` = not date-bound. */
    Date effectiveFrom
    /* Default rate for the country (one per country); fallback for lookups when no dated rate applies. */
    Boolean isDefault
    /* Human name, e.g. \"VAT\". */
    String name
    /* Rate in hundredths of a percent: 1900 = 19.00%. */
    Long ratePercent
}
