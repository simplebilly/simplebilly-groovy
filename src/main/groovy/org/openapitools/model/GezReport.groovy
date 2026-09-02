package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.BetriebsstaettenDetail;

@Canonical
class GezReport {
    
    Long beitragsfreieKfz
    
    Long beitragspflichtigeKfz
    
    List<BetriebsstaettenDetail> betriebsstaetten = new ArrayList<>()
    
    String hinweis
    
    String hotelzimmerBeitrag
    
    String jaehrlicherBeitrag
    
    Integer jahr
    
    String kfzBeitrag
    
    String monatlicherBeitrag
    
    String vierteljaehrlicherBeitrag
}
