package ocpp.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.service.HeartBeatService;

@Controller
public class HeartBeatController {
	/*no variables for req()*/

	//fields for conf function are...
	Date currentTime;
	@Autowired
	private HeartBeatService heartBeatService;
	@RequestMapping(value="/heartbeat",method=RequestMethod.POST)
    @ResponseBody
    public Date heartbeat() {
		System.out.println("Syncing clock");
		return heartBeatService.get();
	}
}
