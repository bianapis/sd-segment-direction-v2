package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQInitiativeCreateInputModelBQInitiativeInstanceRecordDateType;

import javax.validation.Valid;
  
/**
 * BQInitiativeCreateInputModelBQInitiativeInstanceRecord
 */
public class BQInitiativeCreateInputModelBQInitiativeInstanceRecord   {
  private String segmentInitiativeBusinessUnitReference = null;

  private String segmentInitiativeType = null;

  private String segmentInitiativeDescription = null;

  private String segmentInitiativeSchedule = null;

  private BQInitiativeCreateInputModelBQInitiativeInstanceRecordDateType dateType = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Business unit responsible for implementing a specific initiative supporting the segment strategy 
   * @return segmentInitiativeBusinessUnitReference
  **/

  public String getSegmentInitiativeBusinessUnitReference() {
    return segmentInitiativeBusinessUnitReference;
  }

  public void setSegmentInitiativeBusinessUnitReference(String segmentInitiativeBusinessUnitReference) {
    this.segmentInitiativeBusinessUnitReference = segmentInitiativeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of initiative (e.g. development project, acquisition, campaign, media communications) 
   * @return segmentInitiativeType
  **/

  public String getSegmentInitiativeType() {
    return segmentInitiativeType;
  }

  public void setSegmentInitiativeType(String segmentInitiativeType) {
    this.segmentInitiativeType = segmentInitiativeType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Definition of the initiative, including planned actions, deliverables and intended outcomes 
   * @return segmentInitiativeDescription
  **/

  public String getSegmentInitiativeDescription() {
    return segmentInitiativeDescription;
  }

  public void setSegmentInitiativeDescription(String segmentInitiativeDescription) {
    this.segmentInitiativeDescription = segmentInitiativeDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Planned and actual dates for activities making up the initiative. Any necessary details describing the purpose or reference properties of the transaction 
   * @return segmentInitiativeSchedule
  **/

  public String getSegmentInitiativeSchedule() {
    return segmentInitiativeSchedule;
  }

  public void setSegmentInitiativeSchedule(String segmentInitiativeSchedule) {
    this.segmentInitiativeSchedule = segmentInitiativeSchedule;
  }


  /**
   * Get dateType
   * @return dateType
  **/

  public BQInitiativeCreateInputModelBQInitiativeInstanceRecordDateType getDateType() {
    return dateType;
  }

  public void setDateType(BQInitiativeCreateInputModelBQInitiativeInstanceRecordDateType dateType) {
    this.dateType = dateType;
  }


}

