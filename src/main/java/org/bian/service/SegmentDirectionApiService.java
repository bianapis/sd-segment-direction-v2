/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface SegmentDirectionApiService {

	SDSegmentDirectionActivateOutputModel activate(SDSegmentDirectionActivateInputModel request);
	
	BQInitiativeCaptureOutputModel captureInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInitiativeCaptureInputModel request);
	
	CRSegmentStrategyCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRSegmentStrategyCaptureInputModel request);
	
	SDSegmentDirectionConfigureOutputModel configure(String sdReferenceId, SDSegmentDirectionConfigureInputModel request);
	
	CRSegmentStrategyCreateOutputModel create(String sdReferenceId, CRSegmentStrategyCreateInputModel request);
	
	BQInitiativeCreateOutputModel createInitiative(String sdReferenceId, String crReferenceId, BQInitiativeCreateInputModel request);
	
	BQInitiativeExchangeOutputModel exchangeInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInitiativeExchangeInputModel request);
	
	CRSegmentStrategyExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRSegmentStrategyExchangeInputModel request);
	
	SDSegmentDirectionFeedbackOutputModel feedback(String sdReferenceId, SDSegmentDirectionFeedbackInputModel request);
	
	CRSegmentStrategyGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRSegmentStrategyGrantInputModel request);
	
	BQInitiativeRequestOutputModel requestInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInitiativeRequestInputModel request);
	
	CRSegmentStrategyRequestOutputModel request(String sdReferenceId, String crReferenceId, CRSegmentStrategyRequestInputModel request);
	
	SDSegmentDirectionRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRSegmentStrategyRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	BQInitiativeRetrieveOutputModel retrieveInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRSegmentStrategyUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRSegmentStrategyUpdateInputModel request);
	
	BQInitiativeUpdateOutputModel updateInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInitiativeUpdateInputModel request);
	
}
