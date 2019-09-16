package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInitiativeRequestInputModelBQInitiativeInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInitiativeRequestOutputModel
 */
public class BQInitiativeRequestOutputModel   {
  private BQInitiativeRequestInputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord = null;

  private String initiativeRequestActionTaskReference = null;

  private Object initiativeRequestActionTaskRecord = null;

  private String initiativeRequestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * Get bQInitiativeInstanceRecord
   * @return bQInitiativeInstanceRecord
  **/

  @JsonProperty("bQInitiativeInstanceRecord")
  public BQInitiativeRequestInputModelBQInitiativeInstanceRecord getBQInitiativeInstanceRecord() {
    return bQInitiativeInstanceRecord;
  }

  public void setBQInitiativeInstanceRecord(BQInitiativeRequestInputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord) {
    this.bQInitiativeInstanceRecord = bQInitiativeInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Initiative instance request service call 
   * @return initiativeRequestActionTaskReference
  **/

  public String getInitiativeRequestActionTaskReference() {
    return initiativeRequestActionTaskReference;
  }

  public void setInitiativeRequestActionTaskReference(String initiativeRequestActionTaskReference) {
    this.initiativeRequestActionTaskReference = initiativeRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return initiativeRequestActionTaskRecord
  **/

  public Object getInitiativeRequestActionTaskRecord() {
    return initiativeRequestActionTaskRecord;
  }

  public void setInitiativeRequestActionTaskRecord(Object initiativeRequestActionTaskRecord) {
    this.initiativeRequestActionTaskRecord = initiativeRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Initiative service request record 
   * @return initiativeRequestRecordReference
  **/

  public String getInitiativeRequestRecordReference() {
    return initiativeRequestRecordReference;
  }

  public void setInitiativeRequestRecordReference(String initiativeRequestRecordReference) {
    this.initiativeRequestRecordReference = initiativeRequestRecordReference;
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

