import java.util.Scanner;

import Utility.Console;
import model.Contact;

public class ContactListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Welcome to the Contact List App");
	//	Contact c1 = new Contact();
	//	c1.setFirstName("George");
	//	c1.setLastName("McFly");
	//	c1.setEmail("george@b2rty.com");
	//	c1.setPhone("444-444-4444");
		
		//System.out.println(c1);
		Scanner sc = new Scanner (System.in) ;
		String choice = "y";
		
		String firstName = Console.getString("Enter first name");
		String lastName = Console.getString("Enter last name");
		String email = Console.getString("Enter Email");
		String phone = Console.getString("Phone Number:");
		
		Contact contact = new Contact (firstName, lastName, email, phone);
		System.out.println();
		System.out.println(contact.displayContact());
		System.out.println("Bye");

	}

}
