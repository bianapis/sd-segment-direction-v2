package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInitiativeRetrieveInputModelInitiativeInstanceAnalysis;
import org.bian.dto.BQInitiativeRetrieveInputModelInitiativeInstanceReport;

import javax.validation.Valid;
  
/**
 * BQInitiativeRetrieveInputModel
 */
public class BQInitiativeRetrieveInputModel   {
  private Object initiativeRetrieveActionTaskRecord = null;

  private String initiativeRetrieveActionRequest = null;

  private BQInitiativeRetrieveInputModelInitiativeInstanceReport initiativeInstanceReport = null;

  private BQInitiativeRetrieveInputModelInitiativeInstanceAnalysis initiativeInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return initiativeRetrieveActionRequest
  **/

  public String getInitiativeRetrieveActionRequest() {
    return initiativeRetrieveActionRequest;
  }

  public void setInitiativeRetrieveActionRequest(String initiativeRetrieveActionRequest) {
    this.initiativeRetrieveActionRequest = initiativeRetrieveActionRequest;
  }


  /**
   * Get initiativeInstanceReport
   * @return initiativeInstanceReport
  **/

  public BQInitiativeRetrieveInputModelInitiativeInstanceReport getInitiativeInstanceReport() {
    return initiativeInstanceReport;
  }

  public void setInitiativeInstanceReport(BQInitiativeRetrieveInputModelInitiativeInstanceReport initiativeInstanceReport) {
    this.initiativeInstanceReport = initiativeInstanceReport;
  }


  /**
   * Get initiativeInstanceAnalysis
   * @return initiativeInstanceAnalysis
  **/

  public BQInitiativeRetrieveInputModelInitiativeInstanceAnalysis getInitiativeInstanceAnalysis() {
    return initiativeInstanceAnalysis;
  }

  public void setInitiativeInstanceAnalysis(BQInitiativeRetrieveInputModelInitiativeInstanceAnalysis initiativeInstanceAnalysis) {
    this.initiativeInstanceAnalysis = initiativeInstanceAnalysis;
  }


}

