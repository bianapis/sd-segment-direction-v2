package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyRetrieveOutputModelSegmentStrategyInstanceAnalysis
 */
public class CRSegmentStrategyRetrieveOutputModelSegmentStrategyInstanceAnalysis   {
  private String segmentStrategyInstanceAnalysisData = null;

  private String segmentStrategyInstanceAnalysisReportType = null;

  private Object segmentStrategyInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return segmentStrategyInstanceAnalysisData
  **/

  public String getSegmentStrategyInstanceAnalysisData() {
    return segmentStrategyInstanceAnalysisData;
  }

  public void setSegmentStrategyInstanceAnalysisData(String segmentStrategyInstanceAnalysisData) {
    this.segmentStrategyInstanceAnalysisData = segmentStrategyInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return segmentStrategyInstanceAnalysisReportType
  **/

  public String getSegmentStrategyInstanceAnalysisReportType() {
    return segmentStrategyInstanceAnalysisReportType;
  }

  public void setSegmentStrategyInstanceAnalysisReportType(String segmentStrategyInstanceAnalysisReportType) {
    this.segmentStrategyInstanceAnalysisReportType = segmentStrategyInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return segmentStrategyInstanceAnalysisReport
  **/

  public Object getSegmentStrategyInstanceAnalysisReport() {
    return segmentStrategyInstanceAnalysisReport;
  }

  public void setSegmentStrategyInstanceAnalysisReport(Object segmentStrategyInstanceAnalysisReport) {
    this.segmentStrategyInstanceAnalysisReport = segmentStrategyInstanceAnalysisReport;
  }


}

