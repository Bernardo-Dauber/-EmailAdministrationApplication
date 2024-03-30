package emailapp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your first name: ");
		String firstName = input.next();
		System.out.println("Enter your last name: ");
		String lastName = input.next();
		
		Email em1 = new Email(firstName,lastName);
		
		
		
		
		
		input.close();
	}

}
