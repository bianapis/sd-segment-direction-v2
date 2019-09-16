package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInitiativeUpdateInputModelBQInitiativeInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInitiativeUpdateOutputModel
 */
public class BQInitiativeUpdateOutputModel   {
  private BQInitiativeUpdateInputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord = null;

  private String initiativeUpdateActionTaskReference = null;

  private Object initiativeUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * Get bQInitiativeInstanceRecord
   * @return bQInitiativeInstanceRecord
  **/

  @JsonProperty("bQInitiativeInstanceRecord")
  public BQInitiativeUpdateInputModelBQInitiativeInstanceRecord getBQInitiativeInstanceRecord() {
    return bQInitiativeInstanceRecord;
  }

  public void setBQInitiativeInstanceRecord(BQInitiativeUpdateInputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord) {
    this.bQInitiativeInstanceRecord = bQInitiativeInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return initiativeUpdateActionTaskReference
  **/

  public String getInitiativeUpdateActionTaskReference() {
    return initiativeUpdateActionTaskReference;
  }

  public void setInitiativeUpdateActionTaskReference(String initiativeUpdateActionTaskReference) {
    this.initiativeUpdateActionTaskReference = initiativeUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

