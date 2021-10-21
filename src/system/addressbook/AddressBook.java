package system.addressbook;
/*
 * class for maintaining address book operations
 */

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
	
	ArrayList<ContactPerson> contacts;
	Scanner input = new Scanner(System.in);
	String name;
	//Constructor
	public AddressBook() {
		contacts = new ArrayList<ContactPerson>();
	}
	
	void addContact() {
		
		ContactPerson newcontact = new ContactPerson();
		contacts.add(newcontact);
	}
	
	void readContact() {
		
		System.out.println("Enter Name to serach in Address Book");
		name = input.nextLine();
		for(int i = 0; i < contacts.size(); i++) {
			ContactPerson read = (ContactPerson)contacts.get(i);
			if(name.equalsIgnoreCase(read.firstName)) {
				read.readContact();
			}//if statement

		}//for
	}
	
	void editContact() {
		
		System.out.println("Enter Name to edit in Address Book");
		name = input.nextLine();
		for(int i = 0; i < contacts.size(); i++) {
			ContactPerson read = (ContactPerson)contacts.get(i);
			if(name.equalsIgnoreCase(read.firstName)) {
				System.out.println("Enter new Name for '" + name + "' :");
				read.setFirstName(name);
			}//if statement

		}
		
	}


}
