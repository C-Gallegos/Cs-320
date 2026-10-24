package Contact;

import java.util.List;
import java.util.ArrayList;

public class ContactService {

    int currentId = 0;
    public static List<Contact> contacts = new ArrayList<Contact>();

    public void addContact(String firstName, String lastName, String phoneNumber, String address){
        String stringId = Integer.toString(currentId);
        Contact  newContact = new Contact(stringId, firstName, lastName, phoneNumber, address);
        contacts.add(newContact.getContactId(), newContact);
        currentId++;    

    } 

    public void deleteContact(String id){
        int intId = Integer.valueOf(id);
        for (int i = 0; i < contacts.size(); i++){
            if (contacts.get(i).getContactId() == intId){
                contacts.remove(i);
                return;
            }
        }
    }

    public void editFirstName(String id, String firstName){
        for (Contact iter: contacts){
            if (iter.getContactId() == Integer.valueOf(id)){
                iter.setFirstName(firstName);
                return;
            }
        }
    }

    public void editLastName(String id, String lastName){
        for (Contact iter: contacts){
            if (iter.getContactId() == Integer.valueOf(id)){
                iter.setLastName(lastName);
                return;
            }
        }
    }

    public void editPhoneNumber(String id, String phoneNumber){
        for (Contact iter: contacts){
            if (iter.getContactId() == Integer.valueOf(id)){
                iter.setPhoneNumber(phoneNumber);
                return;
            }
        }
    }

    public void editAddress(String id, String address){
        for (Contact iter: contacts){
            if (iter.getContactId() == Integer.valueOf(id)){
                iter.setAddress(address);
                return;
            }
        }
    }

    
}
