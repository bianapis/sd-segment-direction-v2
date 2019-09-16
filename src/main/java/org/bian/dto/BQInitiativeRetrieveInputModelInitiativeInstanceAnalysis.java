package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInitiativeRetrieveInputModelInitiativeInstanceAnalysis
 */
public class BQInitiativeRetrieveInputModelInitiativeInstanceAnalysis   {
  private String initiativeInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return initiativeInstanceAnalysisReference
  **/

  public String getInitiativeInstanceAnalysisReference() {
    return initiativeInstanceAnalysisReference;
  }

  public void setInitiativeInstanceAnalysisReference(String initiativeInstanceAnalysisReference) {
    this.initiativeInstanceAnalysisReference = initiativeInstanceAnalysisReference;
  }


}

