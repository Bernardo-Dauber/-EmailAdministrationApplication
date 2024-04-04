
package emailapp;

import java.security.SecureRandom;
import java.util.ArrayList;

public class SystemEmail {
	
	
	private ArrayList<Email> listEmail; 
	private String firstName; 
	private String lastName;  
	private String department; 
	
	
	public SystemEmail(/*String firstName, String lastName, String department*/) {
       //this.firstName = firstName;
       //this.lastName = lastName;
       //this.department = department;
       listEmail = new ArrayList<Email>();
    }

	// GET AND SET 
	

	
		public ArrayList<Email> getListEmail() {
		return listEmail;
	}

		public void setListEmail(ArrayList<Email> listEmail) {
			this.listEmail = listEmail;
		}
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
	
		public String getDepartment() {
			return department;
		}
	
		public void setDepartment(String department) {
			this.department = department;
		}	
	
	
	// Generate a random  password
	private String generatePassword() {
			    final String CHARACTERS = "ABCDEFGHIJKLMNOPQRS TUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$*";

			    StringBuilder randomPassword = new StringBuilder();
			    SecureRandom random = new SecureRandom();

			    for (int i = 0; i < 8; i++) {
			        int randomIndex = random.nextInt(CHARACTERS.length());
			        randomPassword.append(CHARACTERS.charAt(randomIndex));
			    }

			    return randomPassword.toString();
			    
			}	 
		//Generate Email 
		
		public void generateEmail() {
			String createdEmail = ( getFirstName().toLowerCase() + getLastName().toLowerCase() + "@"+ 
			getDepartment().toLowerCase() + ".company.com");
			Email email = new Email(createdEmail,generatePassword()); //create object email
			listEmail.add(email);//save email and password 			
			System.out.println(email);
		}

		public void showInfo() {
			System.out.println("Lista Emails:");	
			for(int i = 0; i<listEmail.size();i++) { 
				System.out.println(listEmail.get(i));
			}
		}
	
	//Set alternate  email 
	 
	public void ChangeEmail(String emailAddress, String newAddresEmail) {
		
		for (int i = 0; i < listEmail.size(); i++) {
	        if (emailAddress.equals(listEmail.get(i).getEmail())) {
	            listEmail.get(i).setEmail(newAddresEmail);
	            System.out.println("Email address changed successfully.");
	            return; // Como já encontramos e alteramos o email, podemos sair do loop
	        }
	    }
	    // Se o loop terminar sem encontrar o email, exiba uma mensagem de erro
	    System.out.println("Email address not found in the list.");
	}
	
		 
	// Change the password 
	
	public void changePassword(String emailAddress, String newPassword) {
		for (int i = 0; i < listEmail.size(); i++) {
	        if (emailAddress.equals(listEmail.get(i).getEmail())) {
	            listEmail.get(i).setPassword(newPassword);
	            System.out.println("Password changed successfully.");
	            return; // Como já encontramos e alteramos a senha, podemos sair do loop
	        }
	    }
	    // Se o loop terminar sem encontrar o email, exiba uma mensagem de erro
	    System.out.println("Email address not found in the list.");
	}
		
	
}
