package src.Tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Contact.ContactService;

class ContactServiceTest {

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		ContactService.contacts.clear();
	}

	@Test
	@DisplayName("AddContact")
	void testAddContact() {
		
		ContactService test= new ContactService();
		
		test.addContact("Cristian", "Gallegos", "2249449617", "123 main st");

		assertFalse(ContactService.contacts.isEmpty());
		assertEquals(0, ContactService.contacts.get(0).getContactId());
		assertEquals("Cristian",ContactService.contacts.get(0).getFirstName());
		assertEquals("Gallegos",ContactService.contacts.get(0).getLastName());
		assertEquals("2249449617",ContactService.contacts.get(0).getPhoneNumber());
		assertEquals("123 main st",ContactService.contacts.get(0).getAddress());
		ContactService.contacts.clear();
	}
	
	@Test
	@DisplayName("Del Contact")
	void testDelContact() {
		
		ContactService test= new ContactService();
		
		test.addContact("Cristian", "Gallegos", "2249449617", "123 main st");
		test.addContact("Eddard", "Stark", "1235642435", "Winterfell");
		test.addContact("Booker", "Dewitt", "2243349617", "Dragonstone");
		
		assertEquals(4,ContactService.contacts.size());
		
		test.deleteContact("2");
		
		assertEquals(3,ContactService.contacts.size());
		
		ContactService.contacts.clear();
		
	}
	

	@Test
	@DisplayName("Edit Phone")
	
	void testEditPhone() {
		ContactService test= new ContactService();
		test.addContact("Eddard", "Stark", "1235642435", "Winterfell");
		test.editPhoneNumber("0","8888888888" );
		assertEquals("8888888888",ContactService.contacts.get(0).getPhoneNumber());
		
	}
	
	
	@Test
	@DisplayName("Edit First Name")
	void testEditFirstName() {
		ContactService test= new ContactService();
		test.addContact("Eddard", "Stark", "1235642435", "Winterfell");
		test.editFirstName("0", "Robb");
		assertEquals("Robb",ContactService.contacts.get(0).getFirstName());
	}
	@Test
	@DisplayName("Edit Last Name")
	void testEditLastName() {
		ContactService test= new ContactService();
		test.addContact("Eddard", "Stark", "1235642435", "Winterfell");
		test.editLastName("0", "Stone");
		assertEquals("Stone",ContactService.contacts.get(0).getLastName());
	}
	@Test
	@DisplayName("Edit Address")
	void testEditAddress() {
		ContactService test= new ContactService();
		test.addContact("Eddard", "Stark", "1235642435", "Winterfell");
		test.editAddress("0", "Kingslanding");
		assertEquals("Kingslanding",ContactService.contacts.get(0).getAddress());
	}

}
