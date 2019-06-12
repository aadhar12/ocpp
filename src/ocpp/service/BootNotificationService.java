package ocpp.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import ocpp.essential.Status;
import ocpp.essential.Status.Registration;

@Service
public class BootNotificationService {
	/*req() variables*/
	String chargeBoxSerialNumber; /*Optional. This contains a value(length<25) that identifies serial number of the
										charge box inside the charge point. Deprecated,will be removed in future version.*/
    String chargePointModel; //Required. This contains a value(length<20) that identifies the model of the charge point
	String chargePointSerialNumber; //Optional. This contains a value(length<25) that identifies the serial number
										//of charge point
	String chargePointVendor; //Required. This contains the value(length<20) that identifies the vendor of the charge point.
	String firmwareVersion; //Optional. This contains the firmware version(length<50) of the charge point.
	String iccid; //Optional. This contains the ICCID(length<20) of the modem's SIM card
	String imsi; //Optional. This contains the IMSI(length<20) of the modem's SIM card
	String meterSerialNumber; //Optional. This contains the serial number(length<25) of the main electrical meter
								 //of the Charge point.
	String meterType; //Optional. This contains the type(length<25) of the main electrical meter of the Charge point.

	/*conf() variables*/
	Date currentTime;  //Required. Contains Central System's current time
	int interval; /*Required. When registration is accepted,this contains the heartbeat interval in seconds.
	                 If Central System returns something other than accepted, value of interval field indicates
	                 minimum wait time before sedmomg a next BootNotification reqeust*/
	Status.Registration status; /*Required. This contains whether the charge point has been registered
									within the Central System*/
	public Registration bootDevice() {
		// code to boot device
		return status;
	}
	
}
