package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.ContactInfo;
import org.openapitools.model.QuizQuestion;
import org.openapitools.model.Section;

@Canonical
class TrainingContent {
    
    String code
    
    ContactInfo contact
    
    Integer passScore
    
    List<QuizQuestion> quiz = new ArrayList<>()
    
    List<Section> sections = new ArrayList<>()
    
    String title
    
    String titleEn
}
