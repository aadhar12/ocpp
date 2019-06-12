package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.Status;
import ocpp.service.CancelReservationService;

@Controller
public class CancelReservationController {
	//variables of cancelRequest function...
		int reservationId;
		
	//variables of cancelConfirm function...
		Status.Configuration status;
	
	@Autowired
	private CancelReservationService cancelReservationService;
	
	@RequestMapping(value="/cancelReservation",method=RequestMethod.POST)
	@ResponseBody
	public String cancelReservation(@RequestParam ("id") String id) {
		return cancelReservationService.cancel(id);
	}
}