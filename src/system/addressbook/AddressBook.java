package system.addressbook;
/*
 * class for maintaining address book operations
 */
import java.util.Scanner;

public class AddressBook {
	
	//variables
		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		String zip;
		String phoneNumber;
		String eMail;

	@SuppressWarnings("resource")
	
	//method to creating the contacts
	public void createContact() {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter First Name");
		setFirstName(input.nextLine());
		
		System.out.println("Enter Last Name");
		setLastName(input.nextLine());
		
		System.out.println("Enter Address");
		setAddress(input.nextLine());
		
		System.out.println("Enter City");
		setCity(input.nextLine());
		
		System.out.println("Enter State");
		setState(input.nextLine());
		
		System.out.println("Enter Zip");
		setZip(input.nextLine());
		
		System.out.println("Enter Phone Number");
		setPhoneNumber(input.nextLine());
		
		System.out.println("Enter Email Id");
		seteMail(input.nextLine());

	}
	
	//method to reading the contacts
	public void readContact() {
		
		System.out.println("Full Name:    " + getFirstName() + " " + lastName);
		System.out.println("Address:      " + address + ", " + city + ", " + state + ". " + zip);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Email ID:     " + eMail);

	}
	
	
	//getter setter
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	
	
	
	//constructor field
/*	public AddressBook(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNumber, String eMail) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
	}
	*/
	
	
}
