package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSegmentStrategyRetrieveInputModelSegmentStrategyInstanceAnalysis;
import org.bian.dto.CRSegmentStrategyRetrieveInputModelSegmentStrategyInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyRetrieveInputModel
 */
public class CRSegmentStrategyRetrieveInputModel   {
  private Object segmentStrategyRetrieveActionTaskRecord = null;

  private String segmentStrategyRetrieveActionRequest = null;

  private CRSegmentStrategyRetrieveInputModelSegmentStrategyInstanceReportRecord segmentStrategyInstanceReportRecord = null;

  private CRSegmentStrategyRetrieveInputModelSegmentStrategyInstanceAnalysis segmentStrategyInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return segmentStrategyRetrieveActionTaskRecord
  **/

  public Object getSegmentStrategyRetrieveActionTaskRecord() {
    return segmentStrategyRetrieveActionTaskRecord;
  }

  public void setSegmentStrategyRetrieveActionTaskRecord(Object segmentStrategyRetrieveActionTaskRecord) {
    this.segmentStrategyRetrieveActionTaskRecord = segmentStrategyRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return segmentStrategyRetrieveActionRequest
  **/

  public String getSegmentStrategyRetrieveActionRequest() {
    return segmentStrategyRetrieveActionRequest;
  }

  public void setSegmentStrategyRetrieveActionRequest(String segmentStrategyRetrieveActionRequest) {
    this.segmentStrategyRetrieveActionRequest = segmentStrategyRetrieveActionRequest;
  }


  /**
   * Get segmentStrategyInstanceReportRecord
   * @return segmentStrategyInstanceReportRecord
  **/

  public CRSegmentStrategyRetrieveInputModelSegmentStrategyInstanceReportRecord getSegmentStrategyInstanceReportRecord() {
    return segmentStrategyInstanceReportRecord;
  }

  public void setSegmentStrategyInstanceReportRecord(CRSegmentStrategyRetrieveInputModelSegmentStrategyInstanceReportRecord segmentStrategyInstanceReportRecord) {
    this.segmentStrategyInstanceReportRecord = segmentStrategyInstanceReportRecord;
  }


  /**
   * Get segmentStrategyInstanceAnalysis
   * @return segmentStrategyInstanceAnalysis
  **/

  public CRSegmentStrategyRetrieveInputModelSegmentStrategyInstanceAnalysis getSegmentStrategyInstanceAnalysis() {
    return segmentStrategyInstanceAnalysis;
  }

  public void setSegmentStrategyInstanceAnalysis(CRSegmentStrategyRetrieveInputModelSegmentStrategyInstanceAnalysis segmentStrategyInstanceAnalysis) {
    this.segmentStrategyInstanceAnalysis = segmentStrategyInstanceAnalysis;
  }


}

