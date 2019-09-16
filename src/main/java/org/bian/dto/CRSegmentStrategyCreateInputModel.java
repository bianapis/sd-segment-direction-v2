package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSegmentStrategyCreateInputModelSegmentStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyCreateInputModel
 */
public class CRSegmentStrategyCreateInputModel   {
  private String segmentDirectionServicingSessionReference = null;

  private Object segmentStrategyCreateActionRecord = null;

  private String segmentStrategyInstanceStatus = null;

  private CRSegmentStrategyCreateInputModelSegmentStrategyInstanceRecord segmentStrategyInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return segmentDirectionServicingSessionReference
  **/

  public String getSegmentDirectionServicingSessionReference() {
    return segmentDirectionServicingSessionReference;
  }

  public void setSegmentDirectionServicingSessionReference(String segmentDirectionServicingSessionReference) {
    this.segmentDirectionServicingSessionReference = segmentDirectionServicingSessionReference;
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

  public CRSegmentStrategyCreateInputModelSegmentStrategyInstanceRecord getSegmentStrategyInstanceRecord() {
    return segmentStrategyInstanceRecord;
  }

  public void setSegmentStrategyInstanceRecord(CRSegmentStrategyCreateInputModelSegmentStrategyInstanceRecord segmentStrategyInstanceRecord) {
    this.segmentStrategyInstanceRecord = segmentStrategyInstanceRecord;
  }


}

