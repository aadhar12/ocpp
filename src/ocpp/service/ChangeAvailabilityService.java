package ocpp.service;

import org.springframework.stereotype.Service;

import ocpp.essential.Status;
import ocpp.essential.Type;

@Service
public class ChangeAvailabilityService {
	Type.Availability type;   //can have the values available(when its charging) or unavilale(when its not charging)...and is requested by the central system...
	int connectorId;

	//variables of conf function....
	Status.Availability status; //can have values.... scheduled(when its unable to process the request because presently a charge transfer is taking place)
	             //accepted(when the current status is same as requested by the central system...)
	             //else it have to tell the central systen that changes have been implemented...with the present status of the charge point..
	public String change(String id) {
		return "Changed";
	}
}
