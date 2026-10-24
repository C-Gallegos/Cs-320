package Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import java.util.Date;
import java.util.Calendar;
import org.junit.jupiter.api.DisplayName;
import Appointment.Appointment;
class AppointmentTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@DisplayName("Good constructor")
	@Test
	
	void testAppointment() {
		String iD ="1";
		Calendar c =Calendar.getInstance();
		String description = "Good description";
		
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.DATE,03 );
		c.set(Calendar.YEAR, 2027);
		
		Date goodDate =c.getTime();
		
		Appointment tempAppt = new Appointment(iD,goodDate,description);
		
		assertEquals(1,tempAppt.getId());
		assertEquals(goodDate,tempAppt.getDate());
		assertEquals(description,tempAppt.getDescription());
		
	}
	@DisplayName("Id too long")
	@Test
	void testIdLong ()
	{
		String iD ="12345678900000";
		Date date = new Date();
		String description ="This is a fine description.";
		
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->{ new Appointment(iD, date, description);
		
	});
		assertEquals("Invalid ID",exception.getMessage());
	}

	@DisplayName("Id is null")
	@Test
	void testIdNull ()
	{
		String iD =null;
		Date date = new Date();
		String description ="This is a fine description.";
		
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->{ new Appointment(iD, date, description);
		
	});
		assertEquals("Invalid ID",exception.getMessage());
	}
	
	@DisplayName("Past date")
	@Test
	
	void testBaddate() {
		String iD ="2";
		Calendar c =Calendar.getInstance();
		String description = "Good description";
		
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.DATE,03 );
		c.set(Calendar.YEAR, 1927);
		
		Date badDate =c.getTime();
		
		
		
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->{ new Appointment(iD, badDate, description);
		
		});
			assertEquals("Invalid Date",exception.getMessage());
		
	}
	
	
	@DisplayName("Null date")
	@Test
	
	void testNulldate() {
		String iD ="3";
		Calendar c =Calendar.getInstance();
		String description = "Good description";
		
		
		Date badDate =null;
		
		
		
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->{ new Appointment(iD, badDate, description);
		
		});
			assertEquals("Invalid Date",exception.getMessage());
		
	}
	
	@DisplayName("Description is too long")
	@Test
	
	void testDescriptionLong() {
		String iD ="1";
		Calendar c =Calendar.getInstance();
		String description = "Good description dont have to be long, this description is too long. why is it so long?fgfgfgdsfgfgsfgsfgsdff";
		
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.DATE,03 );
		c.set(Calendar.YEAR, 2027);
		
		Date goodDate =c.getTime();
		

		
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->{ new Appointment(iD, goodDate, description);
		
		});
			assertEquals("Invalid Description",exception.getMessage());
		
	}
	
	
	@DisplayName("Description is null")
	@Test
	
	void testDescriptionNull() {
		String iD ="1";
		Calendar c =Calendar.getInstance();
		String description =null;
		
				
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.DATE,03 );
		c.set(Calendar.YEAR, 2027);
		
		Date goodDate =c.getTime();
		

		
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->{ new Appointment(iD, goodDate, description);
		
		});
			assertEquals("Invalid Description",exception.getMessage());
		
	}
	@DisplayName("Description is empty")
	@Test
	
	void testDescriptionEmpty() {
		String iD ="1";
		Calendar c =Calendar.getInstance();
		String description ="";
		
				
		c.set(Calendar.MONTH, 10);
		c.set(Calendar.DATE,03 );
		c.set(Calendar.YEAR, 2027);
		
		Date goodDate =c.getTime();
		

		
		IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,()->{ new Appointment(iD, goodDate, description);
		
		});
			assertEquals("Invalid Description",exception.getMessage());
		
	}
	
	}
	
