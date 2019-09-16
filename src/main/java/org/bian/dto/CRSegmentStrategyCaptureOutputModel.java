package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSegmentStrategyCaptureInputModelSegmentStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyCaptureOutputModel
 */
public class CRSegmentStrategyCaptureOutputModel   {
  private CRSegmentStrategyCaptureInputModelSegmentStrategyInstanceRecord segmentStrategyInstanceRecord = null;

  private String segmentStrategyCaptureActionTaskReference = null;

  private Object segmentStrategyCaptureActionTaskRecord = null;

  private String captureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get segmentStrategyInstanceRecord
   * @return segmentStrategyInstanceRecord
  **/

  public CRSegmentStrategyCaptureInputModelSegmentStrategyInstanceRecord getSegmentStrategyInstanceRecord() {
    return segmentStrategyInstanceRecord;
  }

  public void setSegmentStrategyInstanceRecord(CRSegmentStrategyCaptureInputModelSegmentStrategyInstanceRecord segmentStrategyInstanceRecord) {
    this.segmentStrategyInstanceRecord = segmentStrategyInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Segment Strategy instance capture service call 
   * @return segmentStrategyCaptureActionTaskReference
  **/

  public String getSegmentStrategyCaptureActionTaskReference() {
    return segmentStrategyCaptureActionTaskReference;
  }

  public void setSegmentStrategyCaptureActionTaskReference(String segmentStrategyCaptureActionTaskReference) {
    this.segmentStrategyCaptureActionTaskReference = segmentStrategyCaptureActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return segmentStrategyCaptureActionTaskRecord
  **/

  public Object getSegmentStrategyCaptureActionTaskRecord() {
    return segmentStrategyCaptureActionTaskRecord;
  }

  public void setSegmentStrategyCaptureActionTaskRecord(Object segmentStrategyCaptureActionTaskRecord) {
    this.segmentStrategyCaptureActionTaskRecord = segmentStrategyCaptureActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the structured input transaction/record 
   * @return captureRecordReference
  **/

  public String getCaptureRecordReference() {
    return captureRecordReference;
  }

  public void setCaptureRecordReference(String captureRecordReference) {
    this.captureRecordReference = captureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}

