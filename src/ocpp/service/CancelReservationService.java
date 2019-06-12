package ocpp.service;

import org.springframework.stereotype.Service;

import ocpp.essential.Status;

@Service
public class CancelReservationService {
	//variables of cancelRequest function...
		int reservationId;
			
	//variables of cancelConfirm function...
		Status.Configuration status;

	public String cancel(String id) {
		return "Cancelled";
	}
}