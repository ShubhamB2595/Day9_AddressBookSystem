package system.addressbook;
/*
 * Address book main class
 */

public class AddressBookMain {

	public static void main(String[] args) {
		
		System.out.println("Welcome to address book program");
		
		AddressBook contact = new AddressBook();
		
		System.out.println("Lets add 1st contact");
		contact.createContact();
		System.out.println("Contact");
		contact.readContact();
	}

}
