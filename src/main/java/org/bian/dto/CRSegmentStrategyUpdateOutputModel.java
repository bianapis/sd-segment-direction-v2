package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRSegmentStrategyUpdateOutputModel
 */
public class CRSegmentStrategyUpdateOutputModel   {
  private CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord segmentStrategyInstanceRecord = null;

  private String segmentStrategyUpdateActionTaskReference = null;

  private Object segmentStrategyUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return segmentStrategyUpdateActionTaskReference
  **/

  public String getSegmentStrategyUpdateActionTaskReference() {
    return segmentStrategyUpdateActionTaskReference;
  }

  public void setSegmentStrategyUpdateActionTaskReference(String segmentStrategyUpdateActionTaskReference) {
    this.segmentStrategyUpdateActionTaskReference = segmentStrategyUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return segmentStrategyUpdateActionTaskRecord
  **/

  public Object getSegmentStrategyUpdateActionTaskRecord() {
    return segmentStrategyUpdateActionTaskRecord;
  }

  public void setSegmentStrategyUpdateActionTaskRecord(Object segmentStrategyUpdateActionTaskRecord) {
    this.segmentStrategyUpdateActionTaskRecord = segmentStrategyUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

