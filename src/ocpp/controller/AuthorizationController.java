package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.baseclasses.Authorize;
import ocpp.service.*;

@Controller
public class AuthorizationController {
	Authorize authorize;
	@Autowired
	private AuthorizationService authService;
	@RequestMapping(value="/authorization",method=RequestMethod.POST)
	@ResponseBody
	public String authorized(@RequestParam("id") String id){
		return authService.authorizeUser(id);
	}
}