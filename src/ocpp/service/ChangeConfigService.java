package ocpp.service;

import org.springframework.stereotype.Service;

import ocpp.essential.Status;

@Service
public class ChangeConfigService {
	//variables of req function.
	String key;   //name of the parameter whose value need to be altered..
	String value;  // new value we wanna set for this parameter...
			
	//variables of conf function.
	Status.Configuration status;	//value returned by the charge point in response to the request of the central system.
	public String reconfig(String id) {
		return "Configuration Changed";
	}
	
}
