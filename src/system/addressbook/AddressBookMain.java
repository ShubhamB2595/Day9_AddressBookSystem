package system.addressbook;
/*
 * Address book main class
 */
import java.util.Scanner;

public class AddressBookMain {
	
	//Constants
	private final static int ADD_CONTACT = 1;
	private final static int VIEW_CONTACT = 2;
	private final static int EDIT_CONTACT = 3;
	private final static int DELETE_CONTACT = 4;

	@SuppressWarnings("resource") // for input
	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book Program");
		
		AddressBook contact = new AddressBook();

		for(int i = 0; i<10; i++) {
			System.out.println("Enter option:\n 1 To add new contact \n 2 To view contact \n 3 To edit contact");
			Scanner input = new Scanner(System.in);
			int option = input.nextInt();
		
			switch(option) {
			case ADD_CONTACT:
				contact.addContact();
				break;
			
			case VIEW_CONTACT:
				contact.readContact();
				break;
			
			case EDIT_CONTACT:
				contact.editContact();
				break;
			
			case DELETE_CONTACT:
				contact.deleteContact();
				break;
				
			default:
				System.out.println(option + "Not found, Enter Correct option");
			
			}//switch statement
		
		}
		
	}

}
