package ocpp.service;

import java.util.Date;

import org.springframework.stereotype.Service;

import ocpp.essential.ChargingSchedule;
import ocpp.essential.Status;
import ocpp.essential.Type;

@Service
public class GetCompositeScheduleService {
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
	public String getSchedule(String id) {
		return "Schedule";
	}

}
