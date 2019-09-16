package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInitiativeCreateInputModelBQInitiativeInstanceRecord;
import org.bian.dto.CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQInitiativeCreateInputModel
 */
public class BQInitiativeCreateInputModel   {
  private CRSegmentStrategyCreateOutputModelSegmentStrategyInstanceRecord segmentStrategyInstanceRecord = null;

  private String segmentStrategyInstanceReference = null;

  private Object initiativeInitiateActionRecord = null;

  private BQInitiativeCreateInputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Segment Strategy instance 
   * @return segmentStrategyInstanceReference
  **/

  public String getSegmentStrategyInstanceReference() {
    return segmentStrategyInstanceReference;
  }

  public void setSegmentStrategyInstanceReference(String segmentStrategyInstanceReference) {
    this.segmentStrategyInstanceReference = segmentStrategyInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return initiativeInitiateActionRecord
  **/

  public Object getInitiativeInitiateActionRecord() {
    return initiativeInitiateActionRecord;
  }

  public void setInitiativeInitiateActionRecord(Object initiativeInitiateActionRecord) {
    this.initiativeInitiateActionRecord = initiativeInitiateActionRecord;
  }


  /**
   * Get bQInitiativeInstanceRecord
   * @return bQInitiativeInstanceRecord
  **/

  public BQInitiativeCreateInputModelBQInitiativeInstanceRecord getBQInitiativeInstanceRecord() {
    return bQInitiativeInstanceRecord;
  }

  public void setBQInitiativeInstanceRecord(BQInitiativeCreateInputModelBQInitiativeInstanceRecord bQInitiativeInstanceRecord) {
    this.bQInitiativeInstanceRecord = bQInitiativeInstanceRecord;
  }


}

