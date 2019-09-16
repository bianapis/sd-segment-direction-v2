package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyExchangeOutputModel
 */
public class CRSegmentStrategyExchangeOutputModel   {
  private String segmentStrategyExchangeActionTaskReference = null;

  private Object segmentStrategyExchangeActionTaskRecord = null;

  private String segmentStrategyExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Segment Strategy instance exchange service call 
   * @return segmentStrategyExchangeActionTaskReference
  **/

  public String getSegmentStrategyExchangeActionTaskReference() {
    return segmentStrategyExchangeActionTaskReference;
  }

  public void setSegmentStrategyExchangeActionTaskReference(String segmentStrategyExchangeActionTaskReference) {
    this.segmentStrategyExchangeActionTaskReference = segmentStrategyExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return segmentStrategyExchangeActionResponse
  **/

  public String getSegmentStrategyExchangeActionResponse() {
    return segmentStrategyExchangeActionResponse;
  }

  public void setSegmentStrategyExchangeActionResponse(String segmentStrategyExchangeActionResponse) {
    this.segmentStrategyExchangeActionResponse = segmentStrategyExchangeActionResponse;
  }


}

