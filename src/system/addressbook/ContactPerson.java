package system.addressbook;

import java.util.Scanner;

/*
 * class maintaining the contact person information
 */
public class ContactPerson {
	
	//variables
	String firstName;	
	String lastName;		
	String address;
	String city;
	String state;
	String zip;
	String phoneNumber;
	String eMail;
		

	//method for creating contacts from I/O console
	@SuppressWarnings("resource")
	public ContactPerson() {
			
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

	}// method createContact
		
	//method for reading the contacts
	public void readContact() {
			
		System.out.println("Full Name:    " + getFirstName() + " " + lastName);
		System.out.println("Address:      " + address + ", " + city + ", " + state + ". " + zip);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Email ID:     " + eMail);

	}// method readContact
		
		
	// getter setter
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
			

}
