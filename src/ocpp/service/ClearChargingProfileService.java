package ocpp.service;

import org.springframework.stereotype.Service;

import ocpp.essential.Status;
import ocpp.essential.Type;

@Service
public class ClearChargingProfileService {
	//variables for the req function...
		int id;
		int connectorId;
		int stackLevel;

		Type.ChargingProfilePurpose chargingProfilePurpose;

		//variables for the conf function...
		Status.ClearChargingProfile status;
	public String clear(String id) {
		return "cleared";
	}
}
