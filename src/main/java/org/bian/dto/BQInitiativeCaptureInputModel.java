package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInitiativeCaptureInputModelBQInitiativeInstanceRecord;
import org.bian.dto.CRSegmentStrategyCaptureInputModelCaptureRecordType;

import javax.validation.Valid;
  
/**
 * BQInitiativeCaptureInputModel
 */
public class BQInitiativeCaptureInputModel   {
  private String segmentStrategyInstanceReference = null;

  private String initiativeInstanceReference = null;

  private BQInitiativeCaptureInputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord = null;

  private Object initiativeCaptureActionTaskRecord = null;

  private CRSegmentStrategyCaptureInputModelCaptureRecordType captureRecordType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Segment Strategy instance 
   * @return segmentStrategyInstanceReference
  **/

  public String getSegmentStrategyInstanceReference() {
    return segmentStrategyInstanceReference;
  }

  public void setSegmentStrategyInstanceReference(String segmentStrategyInstanceReference) {
    this.segmentStrategyInstanceReference = segmentStrategyInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Initiative instance 
   * @return initiativeInstanceReference
  **/

  public String getInitiativeInstanceReference() {
    return initiativeInstanceReference;
  }

  public void setInitiativeInstanceReference(String initiativeInstanceReference) {
    this.initiativeInstanceReference = initiativeInstanceReference;
  }


  /**
   * Get bQInitiativeInstanceRecord
   * @return bQInitiativeInstanceRecord
  **/

  public BQInitiativeCaptureInputModelBQInitiativeInstanceRecord getBQInitiativeInstanceRecord() {
    return bQInitiativeInstanceRecord;
  }

  public void setBQInitiativeInstanceRecord(BQInitiativeCaptureInputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord) {
    this.bQInitiativeInstanceRecord = bQInitiativeInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return initiativeCaptureActionTaskRecord
  **/

  public Object getInitiativeCaptureActionTaskRecord() {
    return initiativeCaptureActionTaskRecord;
  }

  public void setInitiativeCaptureActionTaskRecord(Object initiativeCaptureActionTaskRecord) {
    this.initiativeCaptureActionTaskRecord = initiativeCaptureActionTaskRecord;
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

