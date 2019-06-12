package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.Status;
import ocpp.service.ChangeConfigService;

@Controller
public class ChangeConfigController {
	//variables of req function.
		String key;   //name of the parameter whose value need to be altered..
		String value;  // new value we wanna set for this parameter...
		
	//variables of conf function.
	Status.Configuration status;	//value returned by the charge point in response to the request of the central system.
	@Autowired 
	private ChangeConfigService changeConfigService;
	@RequestMapping(value="/changeConfig",method=RequestMethod.POST)
	@ResponseBody
	public String changeConfig(@RequestParam("id") String id) {
		return changeConfigService.reconfig(id);
	}	
}