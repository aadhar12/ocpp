package ocpp.service;

import org.springframework.stereotype.Service;

import ocpp.essential.Status;

@Service
public class ClearCacheService {
	//no variables defined for the req function..

	//variables for conf function...

	Status.ClearCache status;
	public String clear() {
		return "cleared";
	}
}
