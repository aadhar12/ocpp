package ocpp.controller;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.baseclasses.BootNotification;
import ocpp.essential.Status;
import ocpp.service.BootNotificationService;

@Controller
public class BootNotificationController {

	
	BootNotification bootNotification;
	@Autowired
	private BootNotificationService bootNotificationService;
	
	@RequestMapping(value="/bootNotification",method=RequestMethod.POST)
	@ResponseBody
	public String bootNotification(@RequestParam("id") String id) {
		return bootNotificationService.bootDevice(bootNotification.getStatus());
	}
}