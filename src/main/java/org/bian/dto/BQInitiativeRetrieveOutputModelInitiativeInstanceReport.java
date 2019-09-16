package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInitiativeRetrieveOutputModelInitiativeInstanceReport
 */
public class BQInitiativeRetrieveOutputModelInitiativeInstanceReport   {
  private Object initiativeInstanceReportRecord = null;

  private String initiativeInstanceReportType = null;

  private String initiativeInstanceReportParameters = null;

  private Object initiativeInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return initiativeInstanceReportRecord
  **/

  public Object getInitiativeInstanceReportRecord() {
    return initiativeInstanceReportRecord;
  }

  public void setInitiativeInstanceReportRecord(Object initiativeInstanceReportRecord) {
    this.initiativeInstanceReportRecord = initiativeInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return initiativeInstanceReportType
  **/

  public String getInitiativeInstanceReportType() {
    return initiativeInstanceReportType;
  }

  public void setInitiativeInstanceReportType(String initiativeInstanceReportType) {
    this.initiativeInstanceReportType = initiativeInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return initiativeInstanceReportParameters
  **/

  public String getInitiativeInstanceReportParameters() {
    return initiativeInstanceReportParameters;
  }

  public void setInitiativeInstanceReportParameters(String initiativeInstanceReportParameters) {
    this.initiativeInstanceReportParameters = initiativeInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return initiativeInstanceReport
  **/

  public Object getInitiativeInstanceReport() {
    return initiativeInstanceReport;
  }

  public void setInitiativeInstanceReport(Object initiativeInstanceReport) {
    this.initiativeInstanceReport = initiativeInstanceReport;
  }


}

