package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyUpdateInputModel
 */
public class CRSegmentStrategyUpdateInputModel   {
  private String segmentDirectionServicingSessionReference = null;

  private String segmentStrategyInstanceReference = null;

  private CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord segmentStrategyInstanceRecord = null;

  private Object segmentStrategyUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * Get segmentStrategyInstanceRecord
   * @return segmentStrategyInstanceRecord
  **/

  public CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord getSegmentStrategyInstanceRecord() {
    return segmentStrategyInstanceRecord;
  }

  public void setSegmentStrategyInstanceRecord(CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord segmentStrategyInstanceRecord) {
    this.segmentStrategyInstanceRecord = segmentStrategyInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return segmentStrategyUpdateActionTaskRecord
  **/

  public Object getSegmentStrategyUpdateActionTaskRecord() {
    return segmentStrategyUpdateActionTaskRecord;
  }

  public void setSegmentStrategyUpdateActionTaskRecord(Object segmentStrategyUpdateActionTaskRecord) {
    this.segmentStrategyUpdateActionTaskRecord = segmentStrategyUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

