package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.baseclasses.BootNotification;
import ocpp.essential.Status.Registration;
import ocpp.service.BootNotificationService;

@Controller
public class BootNotificationController {

	
	BootNotification bootNotification;
	@Autowired
	private BootNotificationService bootNotificationService;
	
	@RequestMapping(value="/bootNotification",method=RequestMethod.POST)
	@ResponseBody
	public Registration bootNotification(@RequestParam("id") String id) {
		return bootNotificationService.bootDevice();
	}
}