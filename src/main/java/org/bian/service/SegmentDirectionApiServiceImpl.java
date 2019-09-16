/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class SegmentDirectionApiServiceImpl implements SegmentDirectionApiService {

	public SDSegmentDirectionActivateOutputModel activate(SDSegmentDirectionActivateInputModel request){
		return JsonReader.read("activate-SDSegmentDirectionActivateOutputModel.json",new TypeReference<SDSegmentDirectionActivateOutputModel>(){});
	}
	
	public BQInitiativeCaptureOutputModel captureInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInitiativeCaptureInputModel request){
		return JsonReader.read("capture-BQInitiativeCaptureOutputModel.json",new TypeReference<BQInitiativeCaptureOutputModel>(){});
	}
	
	public CRSegmentStrategyCaptureOutputModel capture(String sdReferenceId, String crReferenceId, CRSegmentStrategyCaptureInputModel request){
		return JsonReader.read("capture-CRSegmentStrategyCaptureOutputModel.json",new TypeReference<CRSegmentStrategyCaptureOutputModel>(){});
	}
	
	public SDSegmentDirectionConfigureOutputModel configure(String sdReferenceId, SDSegmentDirectionConfigureInputModel request){
		return JsonReader.read("configure-SDSegmentDirectionConfigureOutputModel.json",new TypeReference<SDSegmentDirectionConfigureOutputModel>(){});
	}
	
	public CRSegmentStrategyCreateOutputModel create(String sdReferenceId, CRSegmentStrategyCreateInputModel request){
		return JsonReader.read("create-CRSegmentStrategyCreateOutputModel.json",new TypeReference<CRSegmentStrategyCreateOutputModel>(){});
	}
	
	public BQInitiativeCreateOutputModel createInitiative(String sdReferenceId, String crReferenceId, BQInitiativeCreateInputModel request){
		return JsonReader.read("create-BQInitiativeCreateOutputModel.json",new TypeReference<BQInitiativeCreateOutputModel>(){});
	}
	
	public BQInitiativeExchangeOutputModel exchangeInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInitiativeExchangeInputModel request){
		return JsonReader.read("exchange-BQInitiativeExchangeOutputModel.json",new TypeReference<BQInitiativeExchangeOutputModel>(){});
	}
	
	public CRSegmentStrategyExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRSegmentStrategyExchangeInputModel request){
		return JsonReader.read("exchange-CRSegmentStrategyExchangeOutputModel.json",new TypeReference<CRSegmentStrategyExchangeOutputModel>(){});
	}
	
	public SDSegmentDirectionFeedbackOutputModel feedback(String sdReferenceId, SDSegmentDirectionFeedbackInputModel request){
		return JsonReader.read("feedback-SDSegmentDirectionFeedbackOutputModel.json",new TypeReference<SDSegmentDirectionFeedbackOutputModel>(){});
	}
	
	public CRSegmentStrategyGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRSegmentStrategyGrantInputModel request){
		return JsonReader.read("grant-CRSegmentStrategyGrantOutputModel.json",new TypeReference<CRSegmentStrategyGrantOutputModel>(){});
	}
	
	public BQInitiativeRequestOutputModel requestInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInitiativeRequestInputModel request){
		return JsonReader.read("request-BQInitiativeRequestOutputModel.json",new TypeReference<BQInitiativeRequestOutputModel>(){});
	}
	
	public CRSegmentStrategyRequestOutputModel request(String sdReferenceId, String crReferenceId, CRSegmentStrategyRequestInputModel request){
		return JsonReader.read("request-CRSegmentStrategyRequestOutputModel.json",new TypeReference<CRSegmentStrategyRequestOutputModel>(){});
	}
	
	public SDSegmentDirectionRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDSegmentDirectionRetrieveOutputModel.json",new TypeReference<SDSegmentDirectionRetrieveOutputModel>(){});
	}
	
	public CRSegmentStrategyRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRSegmentStrategyRetrieveOutputModel.json",new TypeReference<CRSegmentStrategyRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQInitiativeRetrieveOutputModel retrieveInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQInitiativeRetrieveOutputModel.json",new TypeReference<BQInitiativeRetrieveOutputModel>(){});
	}
	
	public CRSegmentStrategyUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRSegmentStrategyUpdateInputModel request){
		return JsonReader.read("update-CRSegmentStrategyUpdateOutputModel.json",new TypeReference<CRSegmentStrategyUpdateOutputModel>(){});
	}
	
	public BQInitiativeUpdateOutputModel updateInitiative(String sdReferenceId, String crReferenceId, String bqReferenceId, BQInitiativeUpdateInputModel request){
		return JsonReader.read("update-BQInitiativeUpdateOutputModel.json",new TypeReference<BQInitiativeUpdateOutputModel>(){});
	}
	
}
