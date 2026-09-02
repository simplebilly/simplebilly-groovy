package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;

@Canonical
class QuizQuestion {
    
    String id
    
    List<String> options = new ArrayList<>()
    
    List<String> optionsEn = new ArrayList<>()
    
    String question
    
    String questionEn
}
