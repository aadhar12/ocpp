package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.Status;
import ocpp.essential.Type;
import ocpp.service.ChangeAvailabilityService;

@Controller
public class ChangeAvailabilityController {
	Type.Availability type;   //can have the values available(when its charging) or unavilale(when its not charging)...and is requested by the central system...
	int connectorId;

	//variables of conf function....
	Status.Availability status; //can have values.... scheduled(when its unable to process the request because presently a charge transfer is taking place)
	             //accepted(when the current status is same as requested by the central system...)
	             //else it have to tell the central systen that changes have been implemented...with the present status of the charge point..
	@Autowired
	private ChangeAvailabilityService changeAvailabiltyService;
	
	@RequestMapping(value="/changeAvailability",method=RequestMethod.POST)
	@ResponseBody
	public String changeAvailabilty(@RequestParam("id") String id) {
		return changeAvailabiltyService.change(id);
	}
}
