package ocpp.service;

import org.springframework.stereotype.Service;

import ocpp.essential.KeyVal;

@Service
public class GetConfigurationService {
	/*req()*/
    String key; //Optional. List of keys for which the configuration value is requested. Length<50

    /*conf()*/
    KeyVal configurationKey; //Optional. List of requested or known keys
    String unknownKey; //Optional. Requested keys that are unknown. Length<50
	

	public String getConfig(String id) {
		return "config";
	}
}
