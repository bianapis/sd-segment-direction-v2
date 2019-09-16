package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInitiativeRetrieveOutputModelBQInitiativeInstanceRecord;
import org.bian.dto.BQInitiativeRetrieveOutputModelInitiativeInstanceAnalysis;
import org.bian.dto.BQInitiativeRetrieveOutputModelInitiativeInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInitiativeRetrieveOutputModel
 */
public class BQInitiativeRetrieveOutputModel   {
  private BQInitiativeRetrieveOutputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord = null;

  private String initiativeRetrieveActionTaskReference = null;

  private Object initiativeRetrieveActionTaskRecord = null;

  private String initiativeRetrieveActionResponse = null;

  private BQInitiativeRetrieveOutputModelInitiativeInstanceReport initiativeInstanceReport = null;

  private BQInitiativeRetrieveOutputModelInitiativeInstanceAnalysis initiativeInstanceAnalysis = null;


  /**
   * Get bQInitiativeInstanceRecord
   * @return bQInitiativeInstanceRecord
  **/

  @JsonProperty("bQInitiativeInstanceRecord")
  public BQInitiativeRetrieveOutputModelBQInitiativeInstanceRecord getBQInitiativeInstanceRecord() {
    return bQInitiativeInstanceRecord;
  }

  public void setBQInitiativeInstanceRecord(BQInitiativeRetrieveOutputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord) {
    this.bQInitiativeInstanceRecord = bQInitiativeInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Initiative instance retrieve service call 
   * @return initiativeRetrieveActionTaskReference
  **/

  public String getInitiativeRetrieveActionTaskReference() {
    return initiativeRetrieveActionTaskReference;
  }

  public void setInitiativeRetrieveActionTaskReference(String initiativeRetrieveActionTaskReference) {
    this.initiativeRetrieveActionTaskReference = initiativeRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return initiativeRetrieveActionTaskRecord
  **/

  public Object getInitiativeRetrieveActionTaskRecord() {
    return initiativeRetrieveActionTaskRecord;
  }

  public void setInitiativeRetrieveActionTaskRecord(Object initiativeRetrieveActionTaskRecord) {
    this.initiativeRetrieveActionTaskRecord = initiativeRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return initiativeRetrieveActionResponse
  **/

  public String getInitiativeRetrieveActionResponse() {
    return initiativeRetrieveActionResponse;
  }

  public void setInitiativeRetrieveActionResponse(String initiativeRetrieveActionResponse) {
    this.initiativeRetrieveActionResponse = initiativeRetrieveActionResponse;
  }


  /**
   * Get initiativeInstanceReport
   * @return initiativeInstanceReport
  **/

  public BQInitiativeRetrieveOutputModelInitiativeInstanceReport getInitiativeInstanceReport() {
    return initiativeInstanceReport;
  }

  public void setInitiativeInstanceReport(BQInitiativeRetrieveOutputModelInitiativeInstanceReport initiativeInstanceReport) {
    this.initiativeInstanceReport = initiativeInstanceReport;
  }


  /**
   * Get initiativeInstanceAnalysis
   * @return initiativeInstanceAnalysis
  **/

  public BQInitiativeRetrieveOutputModelInitiativeInstanceAnalysis getInitiativeInstanceAnalysis() {
    return initiativeInstanceAnalysis;
  }

  public void setInitiativeInstanceAnalysis(BQInitiativeRetrieveOutputModelInitiativeInstanceAnalysis initiativeInstanceAnalysis) {
    this.initiativeInstanceAnalysis = initiativeInstanceAnalysis;
  }


}

