package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyRequestOutputModel
 */
public class CRSegmentStrategyRequestOutputModel   {
  private CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord segmentStrategyInstanceRecord = null;

  private String segmentStrategyRequestActionTaskReference = null;

  private Object segmentStrategyRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Segment Strategy instance request service call 
   * @return segmentStrategyRequestActionTaskReference
  **/

  public String getSegmentStrategyRequestActionTaskReference() {
    return segmentStrategyRequestActionTaskReference;
  }

  public void setSegmentStrategyRequestActionTaskReference(String segmentStrategyRequestActionTaskReference) {
    this.segmentStrategyRequestActionTaskReference = segmentStrategyRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return segmentStrategyRequestActionTaskRecord
  **/

  public Object getSegmentStrategyRequestActionTaskRecord() {
    return segmentStrategyRequestActionTaskRecord;
  }

  public void setSegmentStrategyRequestActionTaskRecord(Object segmentStrategyRequestActionTaskRecord) {
    this.segmentStrategyRequestActionTaskRecord = segmentStrategyRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

