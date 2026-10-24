package src.Tests; 
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import Contact.Contact;
class ContactTest {

    @Test
    @DisplayName("Test Contact Constructor")
    void testContactConstructor() {
        Contact ncontact = new Contact("1", "John", "Doe", "1234567890", "123 Main St");
        assertEquals(1, ncontact.getContactId());
        assertEquals("John", ncontact.getFirstName());
        assertEquals("Doe", ncontact.getLastName());
        assertEquals("1234567890", ncontact.getPhoneNumber());
        assertEquals("123 Main St", ncontact.getAddress());
    }

    @Test
    @DisplayName("Test Invalid Contact Id ")
    void testInvalidContactId() {
    	Contact ncontact = new Contact("12345678901", "John", "Doe", "1234567890", "123 Main St");
    }
    
    @Test
    @DisplayName("Test contact First name is valid")
    void testFirstNameChar() {
    	Contact ncontact = new Contact("2", "Johndoethefirst", "Doe", "1234567890", "123 Main St");
    	
    }
    @Test
    @DisplayName("FirstName is null")
    void testFirstNameNull() {
    	Contact ncontact = new Contact("3",null , "Doe", "1234567890", "123 Main St");
    	
    }
    @Test
    @DisplayName("Test contact Last name is valid")
    void testLastNameChar() {
    	Contact ncontact = new Contact("4", "John", "Doegallegos", "1234567890", "123 Main St");
    	
    }
    @Test
    @DisplayName("Last Name is null")
    void testLastNameNull() {
    	Contact ncontact = new Contact("3","John" , null, "1234567890", "123 Main St");
    	
    }
    
    @Test
    @DisplayName("Phone number to short")
    void testPhoneShort() {
    	Contact ncontact = new Contact("1", "John", "Doe", "1234567", "123 Main St");
    }
    
    @Test
    @DisplayName("Phone number to long")
    void testPhoneLong() {
    	Contact ncontact = new Contact("1", "John", "Doe", "12345678904442", "123 Main St");
    }
    
    @Test
    @DisplayName("Phone number is null")
    void testPhoneNull() {
    	Contact ncontact = new Contact("1", "John", "Doe", null, "123 Main St");
    }
    
    
    @Test
    @DisplayName("Address to long")
    void testAdressLong() {
    	Contact ncontact = new Contact("1", "John", "Doe", "1234567890", "123 Main St dsifhsdighsgihsgiosaghsioghsdgoisdjhgoisdgjhaoighoighsdgoihdsgoisgdhaoisgjdsigjsdigojhgoisaghsodigsdioghsdghisdgiohsdioaghsoidghasoighasoigasoigasoihgsadighdsiogv");
    }
    
    @Test
    @DisplayName("Address is null")
    void testNullAddress() {
    	Contact ncontact = new Contact("1", "John", "Doe", "1234567", null);
    }
}