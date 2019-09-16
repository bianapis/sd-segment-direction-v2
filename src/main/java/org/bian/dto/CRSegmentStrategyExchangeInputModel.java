package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSegmentStrategyExchangeInputModelSegmentStrategyExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyExchangeInputModel
 */
public class CRSegmentStrategyExchangeInputModel   {
  private String segmentDirectionServicingSessionReference = null;

  private String segmentStrategyInstanceReference = null;

  private Object segmentStrategyExchangeActionTaskRecord = null;

  private CRSegmentStrategyExchangeInputModelSegmentStrategyExchangeActionRequest segmentStrategyExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return segmentStrategyExchangeActionTaskRecord
  **/

  public Object getSegmentStrategyExchangeActionTaskRecord() {
    return segmentStrategyExchangeActionTaskRecord;
  }

  public void setSegmentStrategyExchangeActionTaskRecord(Object segmentStrategyExchangeActionTaskRecord) {
    this.segmentStrategyExchangeActionTaskRecord = segmentStrategyExchangeActionTaskRecord;
  }


  /**
   * Get segmentStrategyExchangeActionRequest
   * @return segmentStrategyExchangeActionRequest
  **/

  public CRSegmentStrategyExchangeInputModelSegmentStrategyExchangeActionRequest getSegmentStrategyExchangeActionRequest() {
    return segmentStrategyExchangeActionRequest;
  }

  public void setSegmentStrategyExchangeActionRequest(CRSegmentStrategyExchangeInputModelSegmentStrategyExchangeActionRequest segmentStrategyExchangeActionRequest) {
    this.segmentStrategyExchangeActionRequest = segmentStrategyExchangeActionRequest;
  }


}

