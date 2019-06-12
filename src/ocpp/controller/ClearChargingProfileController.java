package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.Status;
import ocpp.essential.Type;
import ocpp.service.ClearChargingProfileService;

@Controller
public class ClearChargingProfileController {
	//variables for the req function...
	int id;
	int connectorId;
	int stackLevel;

	Type.ChargingProfilePurpose chargingProfilePurpose;

	//variables for the conf function...
	Status.ClearChargingProfile status;
	@Autowired
	private ClearChargingProfileService clearChargingProfileSerivce;
	@RequestMapping(value="/clearChargingProfile",method=RequestMethod.POST)
	@ResponseBody
	public String clearChargingProfile(@RequestParam("id") String id) {
		return clearChargingProfileSerivce.clear(id);
	}
}
