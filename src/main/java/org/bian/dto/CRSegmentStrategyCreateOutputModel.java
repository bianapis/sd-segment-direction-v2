package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyCreateOutputModel
 */
public class CRSegmentStrategyCreateOutputModel   {
  private String segmentStrategyInstanceReference = null;

  private String segmentStrategyCreateActionReference = null;

  private Object segmentStrategyCreateActionRecord = null;

  private String segmentStrategyInstanceStatus = null;

  private CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord segmentStrategyInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Segment Strategy instance 
   * @return segmentStrategyInstanceReference
  **/

  public String getSegmentStrategyInstanceReference() {
    return segmentStrategyInstanceReference;
  }

  public void setSegmentStrategyInstanceReference(String segmentStrategyInstanceReference) {
    this.segmentStrategyInstanceReference = segmentStrategyInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return segmentStrategyCreateActionReference
  **/

  public String getSegmentStrategyCreateActionReference() {
    return segmentStrategyCreateActionReference;
  }

  public void setSegmentStrategyCreateActionReference(String segmentStrategyCreateActionReference) {
    this.segmentStrategyCreateActionReference = segmentStrategyCreateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return segmentStrategyCreateActionRecord
  **/

  public Object getSegmentStrategyCreateActionRecord() {
    return segmentStrategyCreateActionRecord;
  }

  public void setSegmentStrategyCreateActionRecord(Object segmentStrategyCreateActionRecord) {
    this.segmentStrategyCreateActionRecord = segmentStrategyCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Segment Strategy instance (e.g. initialised, pending, active) 
   * @return segmentStrategyInstanceStatus
  **/

  public String getSegmentStrategyInstanceStatus() {
    return segmentStrategyInstanceStatus;
  }

  public void setSegmentStrategyInstanceStatus(String segmentStrategyInstanceStatus) {
    this.segmentStrategyInstanceStatus = segmentStrategyInstanceStatus;
  }


  /**
   * Get segmentStrategyInstanceRecord
   * @return segmentStrategyInstanceRecord
  **/

  public CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord getSegmentStrategyInstanceRecord() {
    return segmentStrategyInstanceRecord;
  }

  public void setSegmentStrategyInstanceRecord(CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord segmentStrategyInstanceRecord) {
    this.segmentStrategyInstanceRecord = segmentStrategyInstanceRecord;
  }


}

