package Contact;
public class Contact {
    /*variables */
    private String contactId;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    /*
    *check if the contactId is valid (not null and not longer than 10 characters)
     */
    private boolean validContactId(String contactId) {
        if (contactId == null || contactId.length()>10) {
            return false;
        }
        return true;
    }
    
    /*check if the firstName is valid (not null and not longer than 10 characters)
     */
    private boolean validFirstName(String firstName) {
        return !(firstName == null || firstName.length()>10);
       
    
    }

    /*check if the lastName is valid (not null and not longer than 10 characters)
     */
    private final boolean validLastName (String lastName) {
        if (lastName == null || lastName.length()>10) {
            return false;
        }
        return true;
    }

    /*check if the phoneNumber is valid (not null and exactly 10 characters)
     */
    private boolean validPhoneNumber (String phoneNumber) {
        if (phoneNumber == null || phoneNumber.length()!=10) {
            return false;
        }
        return true;
    }
    
    /*check if the address is valid (not null and not longer than 30 characters)
     */
    private final boolean validAddress (String address) {
        if (address == null || address.length()>30) {
            return false;
        }
        return true;
    }

/*constructor for the contact class
     * @param contactId
     * @param firstName
     * @param lastName
     * @param phoneNumber
     * @param address
     */
    public Contact(String contactId, String firstName, String lastName, String phoneNumber, String address) {
        if (!validContactId(contactId)) {
            throw new IllegalArgumentException("Invalid contactId");
        }
        if (!validFirstName(firstName)) {
            throw new IllegalArgumentException("Invalid firstName");
        }
        if (!validLastName(lastName)) {
            throw new IllegalArgumentException("Invalid lastName");
        }
        if (!validPhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Invalid phoneNumber");
        }
        if (!validAddress(address)) {
            throw new IllegalArgumentException("Invalid address");
        }
    
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    /*getters for the contact class
     * @return contactId, firstName, lastName, phoneNumber, address
     */
    /*getter for contactId
    *converts the contactId to an integer */
    
    public int getContactId() {
        return Integer.parseInt(contactId);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    /*setters for the contact class
     * @param firstName, lastName, phoneNumber, address
     */

    public void setFirstName(String firstName) {
        if (!validFirstName(firstName)) {
            throw new IllegalArgumentException("Invalid firstName");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (!validLastName(lastName)) {
            throw new IllegalArgumentException("Invalid lastName");
        }
        this.lastName = lastName;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (!validPhoneNumber(phoneNumber)) {
            throw new IllegalArgumentException("Invalid phoneNumber");
        }
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        if (!validAddress(address)) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }


}


