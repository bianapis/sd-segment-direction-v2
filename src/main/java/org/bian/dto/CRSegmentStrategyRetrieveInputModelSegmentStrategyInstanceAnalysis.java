package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyRetrieveInputModelSegmentStrategyInstanceAnalysis
 */
public class CRSegmentStrategyRetrieveInputModelSegmentStrategyInstanceAnalysis   {
  private String segmentStrategyInstanceAnalysisReference = null;

  private String segmentStrategyInstanceAnalysisReportType = null;

  private String segmentStrategyInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return segmentStrategyInstanceAnalysisReference
  **/

  public String getSegmentStrategyInstanceAnalysisReference() {
    return segmentStrategyInstanceAnalysisReference;
  }

  public void setSegmentStrategyInstanceAnalysisReference(String segmentStrategyInstanceAnalysisReference) {
    this.segmentStrategyInstanceAnalysisReference = segmentStrategyInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return segmentStrategyInstanceAnalysisParameters
  **/

  public String getSegmentStrategyInstanceAnalysisParameters() {
    return segmentStrategyInstanceAnalysisParameters;
  }

  public void setSegmentStrategyInstanceAnalysisParameters(String segmentStrategyInstanceAnalysisParameters) {
    this.segmentStrategyInstanceAnalysisParameters = segmentStrategyInstanceAnalysisParameters;
  }


}

