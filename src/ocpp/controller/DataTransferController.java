package ocpp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.Status;
import ocpp.service.DataTransferService;

@Controller
public class DataTransferController {
	/*req()*/
    String vendorID; //length<25. Required, this identifies the vendor specific implementation
    String messageID; //length<50. Optional, additional identification field.
    String data; //Optional. Data without specified length or format. Used for conf() too.

    /*conf()*/
    Status.DataTransfer status; //Required. This indicates the success or failure of data transfer.
    
	@Autowired
	private DataTransferService dataTransferService;
	
	@RequestMapping(value="/dataTransfer",method=RequestMethod.POST)
	@ResponseBody
	public String dataTransfer(@RequestParam("data") String data) {
		return dataTransferService.dataTransfer(data);
	}
}