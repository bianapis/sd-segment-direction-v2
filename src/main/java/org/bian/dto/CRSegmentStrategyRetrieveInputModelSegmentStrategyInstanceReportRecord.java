package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyRetrieveInputModelSegmentStrategyInstanceReportRecord
 */
public class CRSegmentStrategyRetrieveInputModelSegmentStrategyInstanceReportRecord   {
  private String segmentStrategyInstanceReportReference = null;

  private String segmentStrategyInstanceReportType = null;

  private String segmentStrategyInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return segmentStrategyInstanceReportReference
  **/

  public String getSegmentStrategyInstanceReportReference() {
    return segmentStrategyInstanceReportReference;
  }

  public void setSegmentStrategyInstanceReportReference(String segmentStrategyInstanceReportReference) {
    this.segmentStrategyInstanceReportReference = segmentStrategyInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return segmentStrategyInstanceReportType
  **/

  public String getSegmentStrategyInstanceReportType() {
    return segmentStrategyInstanceReportType;
  }

  public void setSegmentStrategyInstanceReportType(String segmentStrategyInstanceReportType) {
    this.segmentStrategyInstanceReportType = segmentStrategyInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return segmentStrategyInstanceReportParameters
  **/

  public String getSegmentStrategyInstanceReportParameters() {
    return segmentStrategyInstanceReportParameters;
  }

  public void setSegmentStrategyInstanceReportParameters(String segmentStrategyInstanceReportParameters) {
    this.segmentStrategyInstanceReportParameters = segmentStrategyInstanceReportParameters;
  }


}

