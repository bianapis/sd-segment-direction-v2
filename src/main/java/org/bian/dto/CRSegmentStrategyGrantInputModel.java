package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSegmentStrategyGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyGrantInputModel
 */
public class CRSegmentStrategyGrantInputModel   {
  private String segmentDirectionServicingSessionReference = null;

  private String segmentStrategyInstanceReference = null;

  private Object segmentStrategyGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRSegmentStrategyGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return segmentDirectionServicingSessionReference
  **/

  public String getSegmentDirectionServicingSessionReference() {
    return segmentDirectionServicingSessionReference;
  }

  public void setSegmentDirectionServicingSessionReference(String segmentDirectionServicingSessionReference) {
    this.segmentDirectionServicingSessionReference = segmentDirectionServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Segment Strategy instance 
   * @return segmentStrategyInstanceReference
  **/

  public String getSegmentStrategyInstanceReference() {
    return segmentStrategyInstanceReference;
  }

  public void setSegmentStrategyInstanceReference(String segmentStrategyInstanceReference) {
    this.segmentStrategyInstanceReference = segmentStrategyInstanceReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRSegmentStrategyGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRSegmentStrategyGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}

