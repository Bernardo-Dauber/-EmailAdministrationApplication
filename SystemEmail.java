package emailapp;

import java.security.SecureRandom;
import java.util.ArrayList;

public class SystemEmail {
	
	private Information information; 
	private ArrayList<Email> listEmail; 
	
	
	public SystemEmail() {
        this.listEmail = new ArrayList<>();
    }

	// GET AND SET 
	public Information getInformation() {
		return information;
	}

	public void setInformation(Information information) {
		this.information = information;
	}

	public ArrayList<Email> getListEmail() {
		return listEmail;
	}

	public void setListEmail(ArrayList<Email> listEmail) {
		if (listEmail == null) {
	        this.listEmail = new ArrayList<>();
	    } else {
	        this.listEmail = listEmail;
	    }
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
		
		public void generateEmail(Information infoUser) {
			Information information = infoUser; 
			
			String createEmail = ( information.getFirstName().toLowerCase() + information.getLastName().toLowerCase() + "@"+ 
			information.getDepartment() + ".company.com");
			Email email = new Email(createEmail,this.generatePassword()); //create object email
			this.listEmail.add(email);//save email and password 
			
		}


		
		public void showInfo() {
			System.out.println("Lista Emails:");
			for(int i = 0; i <listEmail.size();i++) {
				System.out.println(listEmail.get(i));
			}
			
		}
		
		
		
		/*
	public void generateEmail() {
		this.email
	}
	
	//Set alternate  email 
	 
		 public String otherEmail(String newEmail) {
			 this.email = newEmail; 
			 return email; 
		}
		 
		 // Change the password 
		
		 public String changePassowrd(String newPassword) {
			 this.password = newPassword; 
			 return password; 
		}*/

	
	
	
	
	
	
	
	
	
}
