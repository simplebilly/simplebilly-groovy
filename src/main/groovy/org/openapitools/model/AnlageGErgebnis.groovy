package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.AnlageGKfzHinweis;

@Canonical
class AnlageGErgebnis {
    
    String gewinnVerlust
    
    String gewstGezahlt
    
    String gewstMessbetragApprox
    
    Boolean gewstPflichtig
    
    Integer jahr
    
    List<AnlageGKfzHinweis> kfzHinweise = new ArrayList<>()
}
