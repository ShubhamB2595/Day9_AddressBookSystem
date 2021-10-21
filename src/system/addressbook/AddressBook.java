package system.addressbook;
/*
 * class for maintaining address book operations
 */

import java.util.ArrayList;

public class AddressBook {
	
	ArrayList<ContactPerson> contacts;
	
	//Constructor
	public AddressBook() {
		contacts = new ArrayList<ContactPerson>();
	}
	
	void addContact() {
		
		ContactPerson newcontact = new ContactPerson();
		contacts.add(newcontact);
	}
	
	void readContact(String name) {
		
		for(int i = 0; i < contacts.size(); i++) {
			ContactPerson read = (ContactPerson)contacts.get(i);
			if(name.equals(read.firstName)) {
				read.readContact();
			}//if statement
			else {
				System.out.println("Contact '" + name + "' not available in Address Book");
			}// else
		}//for
	}


}
