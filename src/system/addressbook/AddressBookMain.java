package system.addressbook;
/*
 * Address book main class
 */
import java.util.Scanner;

public class AddressBookMain {
	
	//Constants
	private final static int ADD_CONTACT = 1;


	@SuppressWarnings("resource") // for input
	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book Program");
		
		AddressBook contact = new AddressBook();

		System.out.println("Enter 1 to add new contact");
		Scanner input = new Scanner(System.in);
		int option = input.nextInt();
		
		switch(option) {
		case ADD_CONTACT:
			contact.addContact();
			break;
		
		default:
			System.out.println(option + "Not found, Enter Correct option");
			
		}//switch statement
		
		contact.readContact("RAVI");
		
	}

}
