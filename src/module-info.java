package com.bl.addressbook;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.Scanner;

import com.addressbook.AddressBook;
public class AddressBook implements IAddressBook {
	
	String firstname,lastname,address,city,state,email;
	int zip;
	long phonenumber;
	ArrayList<Contact> addlist = new ArrayList<Contact>();
	Contact newcontact = new Contact(firstname,lastname,address,city,state,email,zip,phonenumber);
	
	
	public void addContact() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the details!! ");
		System.out.println("Enter your first name!!");
		firstname = sc.nextLine();
		
		System.out.println("Enter your second name!!");
		lastname =sc.nextLine();
		
		System.out.println("Enter your address name!!");
		address=sc.nextLine();
		
		System.out.println("Enter your city!!");
		city = sc.nextLine();
		
		System.out.println("Enter your state!!");
		state = sc.nextLine();
		
		System.out.println("Enter your email!!");
		email = sc.nextLine();
		
		System.out.println("Enter the Zip code!!");
		zip = sc.nextInt();
		
		System.out.println("Enter your phone left!!");
		phonenumber = sc.nextLong();
		
		addlist.add(new Contact(firstname, lastname, address, city, state, email, zip, phonenumber));
		System.out.println("Contact details succesfully added...!!!");
		
	}
	

	@Override
	
	public void showaddress() {
		Iterator<Contact> iterator = addlist.iterator();
		while (iterator.hasNext()) {
			Contact c = iterator.next();
			System.out.println(c);
		}
		
		}


	@Override
	public void deleteContact() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please enter the First name for deleting the contact details!!");
		String fname = sc1.nextLine();
		System.out.println(fname);
		//Iterator<Contact> iterator = addlist.iterator();
		//while(iterator.hasNext()) {
		//	Contact c = iterator.next();
		//	if(c.firstname == deleteContact) {
		//		addlist.clear();
				
		//	}
		System.out.println("Deleted");
		sc1.close();
		}
		
		
	}


package com.bl.addressbook;

public class Contact {
	
		String firstname;
		String lastname;
		String address;
		String city;
		String state;
		String email;
		int zip;
		long phonenumber;
		
		

		
		public Contact(String firstname, String lastname,
				String address, String city, String state,
				String email, int zip, long phonenumber) {
			super();
			this.firstname = firstname;
			this.lastname = lastname;
			this.address = address;
			this.city = city;
			this.state = state;
			this.email = email;
			this.zip = zip;
			this.phonenumber = phonenumber;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
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
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public int getZip() {
			return zip;
		}
		public void setZip(int zip) {
			this.zip = zip;
		}
		public long getPhonenumber() {
			return phonenumber;
		}


		public void setPhonenumber(long phonenumber) {
			this.phonenumber = phonenumber;
		}


		@Override
		public String toString() {
			return "Contact [firstname=" + firstname
					+ ", lastname=" + lastname
					+ ", address=" + address + ", city="
					+ city + ", state=" + state + ", email="
					+ email + ", zip=" + zip
					+ ", phonenumber=" + phonenumber + "]";
		}


		
}package com.bl.addressbook;

public class AddressBookMain {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to Address Book System!!");
		IAddressBook addressbook = new AddressBook();
		addressbook.addContact();
		addressbook.addContact();
		addressbook.showaddress();
		//addressbook.deleteContact();
		}
}

sid


public void addnewContact() {

	Iterator<AddressBook> iter = list.iterator();
	try {
	while (iter.hasNext()) {
		AddressBook contact = iter.next();
		System.out.println(
				"Please enter the details as below:");

		System.out.println("Enter the First name : ");
		String firstName = sc.nextLine();

		System.out.println("Enter the last name :");
		String lastName = sc.nextLine();

		System.out.println("Enter your Address : ");
		String address = sc.nextLine();

		System.out.println("Enter your city : ");
		String city = sc.nextLine();

		System.out.println("Enter your State : ");
		String state = sc.nextLine();

		System.out.println("Enter your e-Mail ID : ");
		String email = sc.nextLine();

		System.out.println("Enter your Zip code : ");
		long zip = sc.nextInt();

		System.out.println(
				"Enter your contact number : ");
		long phoneNumber = sc.nextLong();

		list.add(new AddressBook(firstName, lastName,
				address, city, state, phoneNumber, zip,
				email));

		System.out.println("Contact created successfully");
	}
	} catch (Exception e) {
		// TODO: handle exception
	}

}

public void printContact() {
	Iterator<AddressBook> iter = list.iterator();
	while (iter.hasNext()) {
		AddressBook contact = iter.next();
		System.out.println(contact);
	}
}

public void editContact() {

	System.out.println(
			"Enter the firstName of the contact to edit");
	Scanner sc = new Scanner(System.in);
	String newName = sc.next();
	Iterator<AddressBook> iter = list.iterator();
	AddressBook contact = iter.next();
	try {
		while(iter)
		
		if(newName.equals(AddressBook.firstName))
	
	
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}


private AddressBook editContact(String firstName2,
		String newName) {
	// TODO Auto-generated method stub
	return null;
}

public void deleteContact() {
	System.out.println(
			"Enter the firstName to delete the contact");
	Scanner sc1 = new Scanner(System.in);
	String firstName = sc1.nextLine();
	sc1.close();

}

main
con.addnewContact();
con.printContact();
con.editContact();
con.deleteContact();			
