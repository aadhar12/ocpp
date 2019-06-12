package ocpp.service;

import org.springframework.stereotype.Service;

import ocpp.essential.IdTagInfo;

@Service
public class AuthorizationService {
	 /*req()*/
    String idTag;	//Required. Contains identifier that needs to be identified. Length < 20.

    /*conf()*/
    IdTagInfo idTagInfo; //Required. Contains info about authorization status,expiry and parentID.
    
	public String authorizeUser(String id) {
		return "Authorized";
	}
}
