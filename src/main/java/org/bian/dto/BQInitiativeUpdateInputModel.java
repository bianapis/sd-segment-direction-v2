package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInitiativeUpdateInputModelBQInitiativeInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInitiativeUpdateInputModel
 */
public class BQInitiativeUpdateInputModel   {
  private String segmentStrategyInstanceReference = null;

  private String initiativeInstanceReference = null;

  private BQInitiativeUpdateInputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord = null;

  private Object initiativeUpdateActionTaskRecord = null;

  private String initiativeUpdateActionRequest = null;


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

  public BQInitiativeUpdateInputModelBQInitiativeInstanceRecord getBQInitiativeInstanceRecord() {
    return bQInitiativeInstanceRecord;
  }

  public void setBQInitiativeInstanceRecord(BQInitiativeUpdateInputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord) {
    this.bQInitiativeInstanceRecord = bQInitiativeInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return initiativeUpdateActionTaskRecord
  **/

  public Object getInitiativeUpdateActionTaskRecord() {
    return initiativeUpdateActionTaskRecord;
  }

  public void setInitiativeUpdateActionTaskRecord(Object initiativeUpdateActionTaskRecord) {
    this.initiativeUpdateActionTaskRecord = initiativeUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return initiativeUpdateActionRequest
  **/

  public String getInitiativeUpdateActionRequest() {
    return initiativeUpdateActionRequest;
  }

  public void setInitiativeUpdateActionRequest(String initiativeUpdateActionRequest) {
    this.initiativeUpdateActionRequest = initiativeUpdateActionRequest;
  }


}

