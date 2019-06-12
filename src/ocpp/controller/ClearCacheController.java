package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.Status;
import ocpp.service.ClearCacheService;
@Controller
public class ClearCacheController {
	//no variables defined for the req function..

	//variables for conf function...

	Status.ClearCache status;
	
	@Autowired
	private ClearCacheService clearCacheService;
	
	@RequestMapping(value="/clearCache",method=RequestMethod.POST)
	@ResponseBody
	public String clearCache() {
		return clearCacheService.clear();
	}
}
