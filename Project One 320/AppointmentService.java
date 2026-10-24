package Appointment;

import java.util.HashMap;
import java.util.Date;

public class AppointmentService {

	int currentId= 0;
	
	public static HashMap<String, Appointment> appointments = new HashMap<String,Appointment>();
	public void addAppointment (Date date, String description) {
		
		String stringId = Integer.toString(currentId);
		Appointment tempAppointment = new Appointment (stringId, date, description);
		appointments.put(stringId, tempAppointment);
		++currentId;
		
	}
	
	public void delAppointment (String id) {
		if(appointments.containsKey(id)) {
			appointments.remove(id);
			
		}
	}
}
