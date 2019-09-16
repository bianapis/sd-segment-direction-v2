package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyCreateInputModelSegmentStrategyInstanceRecordSegmentGoalRecord
 */
public class CRSegmentStrategyCreateInputModelSegmentStrategyInstanceRecordSegmentGoalRecord   {
  private String segmentGoalType = null;

  private String segmentGoalDefinition = null;

  private String segmentGoalOrganization = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of goal (e.g. market share, new business, relationship performance) 
   * @return segmentGoalType
  **/

  public String getSegmentGoalType() {
    return segmentGoalType;
  }

  public void setSegmentGoalType(String segmentGoalType) {
    this.segmentGoalType = segmentGoalType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A definition of the goal, including the intended actions required to achieve the goal 
   * @return segmentGoalDefinition
  **/

  public String getSegmentGoalDefinition() {
    return segmentGoalDefinition;
  }

  public void setSegmentGoalDefinition(String segmentGoalDefinition) {
    this.segmentGoalDefinition = segmentGoalDefinition;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Identifies the interested parties and their roles and responsibilities for the specific actions supporting the achievement of the goal 
   * @return segmentGoalOrganization
  **/

  public String getSegmentGoalOrganization() {
    return segmentGoalOrganization;
  }

  public void setSegmentGoalOrganization(String segmentGoalOrganization) {
    this.segmentGoalOrganization = segmentGoalOrganization;
  }


}

