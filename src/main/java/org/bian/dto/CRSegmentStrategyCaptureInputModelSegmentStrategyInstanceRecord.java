package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecordSegmentGoalRecord;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyCaptureInputModelSegmentStrategyInstanceRecord
 */
public class CRSegmentStrategyCaptureInputModelSegmentStrategyInstanceRecord   {
  private String segmentStrategyOrganization = null;

  private String segmentStrategyBudget = null;

  private String segmentStrategySchedule = null;

  private CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecordSegmentGoalRecord segmentGoalRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Roles and responsibilities for the oversight of implementation of the strategy 
   * @return segmentStrategyOrganization
  **/

  public String getSegmentStrategyOrganization() {
    return segmentStrategyOrganization;
  }

  public void setSegmentStrategyOrganization(String segmentStrategyOrganization) {
    this.segmentStrategyOrganization = segmentStrategyOrganization;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Target and actual financial budget for the strategy 
   * @return segmentStrategyBudget
  **/

  public String getSegmentStrategyBudget() {
    return segmentStrategyBudget;
  }

  public void setSegmentStrategyBudget(String segmentStrategyBudget) {
    this.segmentStrategyBudget = segmentStrategyBudget;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The target and actual strategy implementation schedule - recording planned and actual initiatives associated with the realization of the strategy 
   * @return segmentStrategySchedule
  **/

  public String getSegmentStrategySchedule() {
    return segmentStrategySchedule;
  }

  public void setSegmentStrategySchedule(String segmentStrategySchedule) {
    this.segmentStrategySchedule = segmentStrategySchedule;
  }


  /**
   * Get segmentGoalRecord
   * @return segmentGoalRecord
  **/

  public CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecordSegmentGoalRecord getSegmentGoalRecord() {
    return segmentGoalRecord;
  }

  public void setSegmentGoalRecord(CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecordSegmentGoalRecord segmentGoalRecord) {
    this.segmentGoalRecord = segmentGoalRecord;
  }


}

