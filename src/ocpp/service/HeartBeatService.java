package ocpp.service;

import java.util.Date;

import org.springframework.stereotype.Service;

@Service
public class HeartBeatService {
	/*no variables for req()*/

	//fields for conf function are...
	Date currentTime;
	public Date get() {
		return new Date();
	}	
}