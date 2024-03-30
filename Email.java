package emailapp;

import java.util.Scanner;
import java.security.SecureRandom;

public class Email {

	 private String firstName; 
	 private String lastName; 
	 private String password; 
	 private String department; 
	 private String email; 
	 private int mailboxCapacity;
	 private String alternateEmail;
	 
	 
	 //Constructor to receive  first and last name
	 
	 
	 public Email(String firstName, String lastName)	 {
		
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email Created: " + this.firstName + this.lastName );
		// Call a method asking for the department return department 
		
		
		
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
				
		//Call a method that returns a random password 
		this.password = generatePassword();
		System.out.println("Your Password: " + this.password);
		
		
		//Combine elements to generate email 
		 email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + department + ".company.com";
		 
		 System.out.println("Email Created: " + email);
		 System.out.println("PassWord: " + this.password);
	 } 
	 
	//Ask for the derpartment 
	 private  String  setDepartment() {
		 System.out.println("Enter the department\n1- Sales\n2- Devlopment\n3- Accounting");
		 Scanner input = new Scanner(System.in);
		 int departmentChoice = input.nextInt();
		 
		 if(departmentChoice == 1) {return "sales";}
		 else if(departmentChoice == 2) {return "dev";}
		 else if(departmentChoice == 3) {return "acct"; }
		 else {return "";}
		 
	 
	 
	 
	 }
	 
	// Generate a random  password
	
	 private String generatePassword() {
		    final String CHARACTERS = "ABCDEFGHIJKLMNOPQRS TUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$*";

		    StringBuilder password = new StringBuilder();
		    SecureRandom random = new SecureRandom();

		    for (int i = 0; i < 8; i++) {
		        int randomIndex = random.nextInt(CHARACTERS.length());
		        password.append(CHARACTERS.charAt(randomIndex));
		    }

		    return password.toString();
		}


	 
	 
	 
	

	 
	 //Set the mail box capacity
	 public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity; 
		
	 }
	 
	 //Set alternate  email 
	 public void setAlternateEmail(String altEmail) {
		 this.alternateEmail = altEmail; 
	 }
	 
	 // Change the password 
	public void changePassWord(String password) {
		this.password = password; 
	}


	public int getMailboxCapacity() {return mailboxCapacity;}
	public String getAlternateEmail() {return alternateEmail;}
	public String getPassword() {return password;}



	
	public String showInfo() {
		return "\nName: "+ firstName + " " + lastName + 
				"\nEmail: " + email + 
				"Mailbox Capacity: " + mailboxCapacity;
	}
}
