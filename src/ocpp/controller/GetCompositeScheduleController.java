package ocpp.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ocpp.essential.ChargingSchedule;
import ocpp.essential.Status;
import ocpp.essential.Type;
import ocpp.service.GetCompositeScheduleService;

@Controller
public class GetCompositeScheduleController {
	/*req()*/
    int connectorId; //Required. The ID of the Connector for which the schedule is requested. When ConnectorId=0, the
                    //Charge Point will calculate the expected consumption for the grid connection.

    int duration; //Required. Time in seconds. Length of requested schedule

    Type.ChargingRateUnit chargingRateUnit; //Optional. Can be used to force a power or current profile

    /*conf()*/
    Status.GetCompositeSchedule status; //Required. Status of the request. The Charge Point will indicate if it
                                            //was able to process the request.

    //int connectorId

    Date scheduleStart; //Optional. Time. Periods contained in the charging profile are relative to this point in time.

    ChargingSchedule chargingSchedule; //Optional. Planned Composite Charging Schedule, the energy consumption
                                       //over time. Always relative to ScheduleStart.

    @Autowired 
    private GetCompositeScheduleService getCompositeScheduleService;
    
    @RequestMapping(value="/getCompositeSchedule",method=RequestMethod.POST)
    @ResponseBody
    public String getCompositeSchedule(@RequestParam("id") String id) {
    	return getCompositeScheduleService.getSchedule(id);
    }
}