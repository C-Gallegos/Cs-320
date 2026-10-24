package Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.Date;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Appointment.Appointment;
import Appointment.AppointmentService;

class AppointmentServiceTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

@AfterEach
void tearDown() throws Exception{
	AppointmentService.appointments.clear();
}

@DisplayName("AddAppointment")
@Test
void addAppointment () {
	
	String description="Its a description";
	Calendar c = Calendar.getInstance();
	c.set(Calendar.MONTH, 10);
	c.set(Calendar.DATE,03 );
	c.set(Calendar.YEAR, 2027);
	
	Date goodDate =c.getTime();
	
	AppointmentService tempAppt = new AppointmentService();
	tempAppt.addAppointment(goodDate,description);
	tempAppt.addAppointment(goodDate,description);
	tempAppt.addAppointment(goodDate,description);
	tempAppt.addAppointment(goodDate,description);
	tempAppt.addAppointment(goodDate,description);
	tempAppt.addAppointment(goodDate,description);
	
	assertTrue(AppointmentService.appointments.containsKey("5"));
	assertEquals(goodDate,AppointmentService.appointments.get("5").getDate());
	assertEquals(description,AppointmentService.appointments.get("5").getDescription());
}

@DisplayName("Del Appointment")
@Test
void delAppointment () {
	
	String description="Its a description";
	Calendar c = Calendar.getInstance();
	c.set(Calendar.MONTH, 10);
	c.set(Calendar.DATE,03 );
	c.set(Calendar.YEAR, 2027);
	
	Date goodDate =c.getTime();
	
	AppointmentService tempAppt = new AppointmentService();
	tempAppt.addAppointment(goodDate,description);
	tempAppt.addAppointment(goodDate,description);
	tempAppt.addAppointment(goodDate,description);
	tempAppt.addAppointment(goodDate,description);
	tempAppt.addAppointment(goodDate,description);
	tempAppt.addAppointment(goodDate,description);

	assertEquals(6,AppointmentService.appointments.size());
	tempAppt.delAppointment("3");
	assertEquals(5,AppointmentService.appointments.size());
	assertFalse(AppointmentService.appointments.containsKey("3"));
	
}

}
