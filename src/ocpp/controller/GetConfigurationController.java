package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.KeyVal;
import ocpp.service.GetConfigurationService;

@Controller
public class GetConfigurationController {
	/*req()*/
    String key; //Optional. List of keys for which the configuration value is requested. Length<50

    /*conf()*/
    KeyVal configurationKey; //Optional. List of requested or known keys
    String unknownKey; //Optional. Requested keys that are unknown. Length<50
	
	@Autowired
	private GetConfigurationService getConfigurationService;
	@RequestMapping(value="/getConfiguration",method=RequestMethod.POST)
    @ResponseBody
    public String getConfiguration(@RequestParam("id") String id) {
    	return getConfigurationService.getConfig(id);
    }
}