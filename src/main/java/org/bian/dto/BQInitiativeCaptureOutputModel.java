package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInitiativeCaptureInputModelBQInitiativeInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInitiativeCaptureOutputModel
 */
public class BQInitiativeCaptureOutputModel   {
  private BQInitiativeCaptureInputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord = null;

  private String initiativeCaptureActionTaskReference = null;

  private Object initiativeCaptureActionTaskRecord = null;

  private String initiativeCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get bQInitiativeInstanceRecord
   * @return bQInitiativeInstanceRecord
  **/

  @JsonProperty("bQInitiativeInstanceRecord")
  public BQInitiativeCaptureInputModelBQInitiativeInstanceRecord getBQInitiativeInstanceRecord() {
    return bQInitiativeInstanceRecord;
  }

  public void setBQInitiativeInstanceRecord(BQInitiativeCaptureInputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord) {
    this.bQInitiativeInstanceRecord = bQInitiativeInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Initiative instance capture service call 
   * @return initiativeCaptureActionTaskReference
  **/

  public String getInitiativeCaptureActionTaskReference() {
    return initiativeCaptureActionTaskReference;
  }

  public void setInitiativeCaptureActionTaskReference(String initiativeCaptureActionTaskReference) {
    this.initiativeCaptureActionTaskReference = initiativeCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Initiative structured input transaction/record 
   * @return initiativeCaptureRecordReference
  **/

  public String getInitiativeCaptureRecordReference() {
    return initiativeCaptureRecordReference;
  }

  public void setInitiativeCaptureRecordReference(String initiativeCaptureRecordReference) {
    this.initiativeCaptureRecordReference = initiativeCaptureRecordReference;
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

