package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSegmentStrategyGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyGrantOutputModel
 */
public class CRSegmentStrategyGrantOutputModel   {
  private String segmentStrategyGrantActionTaskReference = null;

  private Object segmentStrategyGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRSegmentStrategyGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Segment Strategy instance grant service call 
   * @return segmentStrategyGrantActionTaskReference
  **/

  public String getSegmentStrategyGrantActionTaskReference() {
    return segmentStrategyGrantActionTaskReference;
  }

  public void setSegmentStrategyGrantActionTaskReference(String segmentStrategyGrantActionTaskReference) {
    this.segmentStrategyGrantActionTaskReference = segmentStrategyGrantActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return segmentStrategyGrantActionTaskRecord
  **/

  public Object getSegmentStrategyGrantActionTaskRecord() {
    return segmentStrategyGrantActionTaskRecord;
  }

  public void setSegmentStrategyGrantActionTaskRecord(Object segmentStrategyGrantActionTaskRecord) {
    this.segmentStrategyGrantActionTaskRecord = segmentStrategyGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRSegmentStrategyGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRSegmentStrategyGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}

