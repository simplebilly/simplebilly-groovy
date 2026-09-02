package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;

@Canonical
class CustomerGroupCreate {
    
    String description
    /* Contact ids that are members of this group. */
    List<String> memberIds = new ArrayList<>()
    /* Rule description for membership, e.g. \"orders > 5 last 12 months\". */
    String membershipFilter
    /* Unique group name, e.g. \"VIP\", \"Wholesale\", \"Newsletter\". */
    String name
}
