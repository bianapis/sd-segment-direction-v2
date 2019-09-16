package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSegmentStrategyCaptureInputModelCaptureRecordType;
import org.bian.dto.CRSegmentStrategyCaptureInputModelSegmentStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyCaptureInputModel
 */
public class CRSegmentStrategyCaptureInputModel   {
  private String segmentDirectionServicingSessionReference = null;

  private String segmentStrategyInstanceReference = null;

  private CRSegmentStrategyCaptureInputModelSegmentStrategyInstanceRecord segmentStrategyInstanceRecord = null;

  private Object segmentStrategyCaptureActionTaskRecord = null;

  private CRSegmentStrategyCaptureInputModelCaptureRecordType captureRecordType = null;


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

  public CRSegmentStrategyCaptureInputModelSegmentStrategyInstanceRecord getSegmentStrategyInstanceRecord() {
    return segmentStrategyInstanceRecord;
  }

  public void setSegmentStrategyInstanceRecord(CRSegmentStrategyCaptureInputModelSegmentStrategyInstanceRecord segmentStrategyInstanceRecord) {
    this.segmentStrategyInstanceRecord = segmentStrategyInstanceRecord;
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
   * Get captureRecordType
   * @return captureRecordType
  **/

  public CRSegmentStrategyCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(CRSegmentStrategyCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}

