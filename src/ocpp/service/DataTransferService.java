package ocpp.service;

import org.springframework.stereotype.Service;

import ocpp.essential.Status;

@Service
public class DataTransferService {
	/*req()*/
    String vendorID; //length<25. Required, this identifies the vendor specific implementation
    String messageID; //length<50. Optional, additional identification field.
    String data; //Optional. Data without specified length or format. Used for conf() too.

    /*conf()*/
    Status.DataTransfer status; //Required. This indicates the success or failure of data transfer.	
    
	public String dataTransfer(String data) {
		return data;
	}

}
