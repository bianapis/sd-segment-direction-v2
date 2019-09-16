package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInitiativeExchangeOutputModel
 */
public class BQInitiativeExchangeOutputModel   {
  private String initiativeExchangeActionTaskReference = null;

  private Object initiativeExchangeActionTaskRecord = null;

  private String initiativeExchangeActionResponse = null;

  private String initiativeInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Initiative instance exchange service call 
   * @return initiativeExchangeActionTaskReference
  **/

  public String getInitiativeExchangeActionTaskReference() {
    return initiativeExchangeActionTaskReference;
  }

  public void setInitiativeExchangeActionTaskReference(String initiativeExchangeActionTaskReference) {
    this.initiativeExchangeActionTaskReference = initiativeExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return initiativeExchangeActionTaskRecord
  **/

  public Object getInitiativeExchangeActionTaskRecord() {
    return initiativeExchangeActionTaskRecord;
  }

  public void setInitiativeExchangeActionTaskRecord(Object initiativeExchangeActionTaskRecord) {
    this.initiativeExchangeActionTaskRecord = initiativeExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return initiativeExchangeActionResponse
  **/

  public String getInitiativeExchangeActionResponse() {
    return initiativeExchangeActionResponse;
  }

  public void setInitiativeExchangeActionResponse(String initiativeExchangeActionResponse) {
    this.initiativeExchangeActionResponse = initiativeExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Initiative instance (e.g. accepted, rejected, verified) 
   * @return initiativeInstanceStatus
  **/

  public String getInitiativeInstanceStatus() {
    return initiativeInstanceStatus;
  }

  public void setInitiativeInstanceStatus(String initiativeInstanceStatus) {
    this.initiativeInstanceStatus = initiativeInstanceStatus;
  }


}

