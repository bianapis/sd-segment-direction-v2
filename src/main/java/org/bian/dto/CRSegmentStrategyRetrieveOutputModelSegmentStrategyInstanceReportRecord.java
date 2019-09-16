package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyRetrieveOutputModelSegmentStrategyInstanceReportRecord
 */
public class CRSegmentStrategyRetrieveOutputModelSegmentStrategyInstanceReportRecord   {
  private String segmentStrategyInstanceReportData = null;

  private String segmentStrategyInstanceReportType = null;

  private Object segmentStrategyInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return segmentStrategyInstanceReportData
  **/

  public String getSegmentStrategyInstanceReportData() {
    return segmentStrategyInstanceReportData;
  }

  public void setSegmentStrategyInstanceReportData(String segmentStrategyInstanceReportData) {
    this.segmentStrategyInstanceReportData = segmentStrategyInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return segmentStrategyInstanceReport
  **/

  public Object getSegmentStrategyInstanceReport() {
    return segmentStrategyInstanceReport;
  }

  public void setSegmentStrategyInstanceReport(Object segmentStrategyInstanceReport) {
    this.segmentStrategyInstanceReport = segmentStrategyInstanceReport;
  }


}

