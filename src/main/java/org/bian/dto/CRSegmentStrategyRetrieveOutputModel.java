package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord;
import org.bian.dto.CRSegmentStrategyRetrieveOutputModelSegmentStrategyInstanceAnalysis;
import org.bian.dto.CRSegmentStrategyRetrieveOutputModelSegmentStrategyInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyRetrieveOutputModel
 */
public class CRSegmentStrategyRetrieveOutputModel   {
  private CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord segmentStrategyInstanceRecord = null;

  private String segmentStrategyRetrieveActionTaskReference = null;

  private Object segmentStrategyRetrieveActionTaskRecord = null;

  private String segmentStrategyRetrieveActionResponse = null;

  private CRSegmentStrategyRetrieveOutputModelSegmentStrategyInstanceReportRecord segmentStrategyInstanceReportRecord = null;

  private CRSegmentStrategyRetrieveOutputModelSegmentStrategyInstanceAnalysis segmentStrategyInstanceAnalysis = null;


  /**
   * Get segmentStrategyInstanceRecord
   * @return segmentStrategyInstanceRecord
  **/

  public CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord getSegmentStrategyInstanceRecord() {
    return segmentStrategyInstanceRecord;
  }

  public void setSegmentStrategyInstanceRecord(CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord segmentStrategyInstanceRecord) {
    this.segmentStrategyInstanceRecord = segmentStrategyInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Segment Strategy instance retrieve service call 
   * @return segmentStrategyRetrieveActionTaskReference
  **/

  public String getSegmentStrategyRetrieveActionTaskReference() {
    return segmentStrategyRetrieveActionTaskReference;
  }

  public void setSegmentStrategyRetrieveActionTaskReference(String segmentStrategyRetrieveActionTaskReference) {
    this.segmentStrategyRetrieveActionTaskReference = segmentStrategyRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return segmentStrategyRetrieveActionResponse
  **/

  public String getSegmentStrategyRetrieveActionResponse() {
    return segmentStrategyRetrieveActionResponse;
  }

  public void setSegmentStrategyRetrieveActionResponse(String segmentStrategyRetrieveActionResponse) {
    this.segmentStrategyRetrieveActionResponse = segmentStrategyRetrieveActionResponse;
  }


  /**
   * Get segmentStrategyInstanceReportRecord
   * @return segmentStrategyInstanceReportRecord
  **/

  public CRSegmentStrategyRetrieveOutputModelSegmentStrategyInstanceReportRecord getSegmentStrategyInstanceReportRecord() {
    return segmentStrategyInstanceReportRecord;
  }

  public void setSegmentStrategyInstanceReportRecord(CRSegmentStrategyRetrieveOutputModelSegmentStrategyInstanceReportRecord segmentStrategyInstanceReportRecord) {
    this.segmentStrategyInstanceReportRecord = segmentStrategyInstanceReportRecord;
  }


  /**
   * Get segmentStrategyInstanceAnalysis
   * @return segmentStrategyInstanceAnalysis
  **/

  public CRSegmentStrategyRetrieveOutputModelSegmentStrategyInstanceAnalysis getSegmentStrategyInstanceAnalysis() {
    return segmentStrategyInstanceAnalysis;
  }

  public void setSegmentStrategyInstanceAnalysis(CRSegmentStrategyRetrieveOutputModelSegmentStrategyInstanceAnalysis segmentStrategyInstanceAnalysis) {
    this.segmentStrategyInstanceAnalysis = segmentStrategyInstanceAnalysis;
  }


}

