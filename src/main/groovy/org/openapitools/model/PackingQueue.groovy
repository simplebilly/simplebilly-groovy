package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.PackingQueueItem;

@Canonical
class PackingQueue {
    
    List<PackingQueueItem> items = new ArrayList<>()
    
    Integer page
    
    Integer pageSize
    
    Long totalCount
}
