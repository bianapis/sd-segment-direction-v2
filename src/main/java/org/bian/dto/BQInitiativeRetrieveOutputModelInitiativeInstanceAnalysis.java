package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQInitiativeRetrieveOutputModelInitiativeInstanceAnalysis
 */
public class BQInitiativeRetrieveOutputModelInitiativeInstanceAnalysis   {
  private Object initiativeInstanceAnalysisRecord = null;

  private String initiativeInstanceAnalysisReportType = null;

  private String initiativeInstanceAnalysisParameters = null;

  private Object initiativeInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return initiativeInstanceAnalysisRecord
  **/

  public Object getInitiativeInstanceAnalysisRecord() {
    return initiativeInstanceAnalysisRecord;
  }

  public void setInitiativeInstanceAnalysisRecord(Object initiativeInstanceAnalysisRecord) {
    this.initiativeInstanceAnalysisRecord = initiativeInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return initiativeInstanceAnalysisReportType
  **/

  public String getInitiativeInstanceAnalysisReportType() {
    return initiativeInstanceAnalysisReportType;
  }

  public void setInitiativeInstanceAnalysisReportType(String initiativeInstanceAnalysisReportType) {
    this.initiativeInstanceAnalysisReportType = initiativeInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return initiativeInstanceAnalysisParameters
  **/

  public String getInitiativeInstanceAnalysisParameters() {
    return initiativeInstanceAnalysisParameters;
  }

  public void setInitiativeInstanceAnalysisParameters(String initiativeInstanceAnalysisParameters) {
    this.initiativeInstanceAnalysisParameters = initiativeInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate
   * @return initiativeInstanceAnalysisReport
  **/

  public Object getInitiativeInstanceAnalysisReport() {
    return initiativeInstanceAnalysisReport;
  }

  public void setInitiativeInstanceAnalysisReport(Object initiativeInstanceAnalysisReport) {
    this.initiativeInstanceAnalysisReport = initiativeInstanceAnalysisReport;
  }


}

