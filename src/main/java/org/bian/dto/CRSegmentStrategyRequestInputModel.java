package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord;
import org.bian.dto.CRSegmentStrategyRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyRequestInputModel
 */
public class CRSegmentStrategyRequestInputModel   {
  private String segmentDirectionServicingSessionReference = null;

  private String segmentStrategyInstanceReference = null;

  private CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord segmentStrategyInstanceRecord = null;

  private Object segmentStrategyRequestActionTaskRecord = null;

  private CRSegmentStrategyRequestInputModelRequestRecordType requestRecordType = null;


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
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRSegmentStrategyRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRSegmentStrategyRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

