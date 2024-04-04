package emailapp;
import java.util.*;

public class Menu {

	private Scanner input; 
	
	//Constructor 
	public Menu() {
		
		this.input = new Scanner(System.in);
	}
	
	//Create a Menu and the options 
	public void displayMenu() {
		System.out.println("Email Company System:");
		System.out.println("1- Create Email ");
		System.out.println("2- Set other email");
		System.out.println("3- Change Password");
		System.out.println("4- Show Info");
		System.out.println("4- Exit");
		 
	}
	
	//get the user Choice
	public int getUserChoice() {
	    int choice = input.nextInt();
	    input.nextLine(); // consume newline character
	    return choice;
	}
	
	public void performAction(int choice, SystemEmail system) {
	    switch (choice) {
	        case 1:
	            System.out.println("You selected Option 1: Create Email");
	            System.out.println("Enter your first name: ");
	            String firstName = input.next();
	            system.setFirstName(firstName);
	            System.out.println("Enter your last name: ");
	            String lastName = input.next(); 
	            system.setLastName(lastName);
	            System.out.println("Enter your department:\n#Development\n#Sales\n#Accounting: ");
	            String department = input.next();
	            system.setDepartment(department);
	            system.generateEmail();
	            break;
	        case 2:
	            System.out.println("You selected Option 2: Set other Email ");
	            // Adicione código para executar a ação para a Opção 2
	            break;
	        case 3:
	            System.out.println("You selected Option 3");
	            // Adicione código para executar a ação para a Opção 3
	            break;
	        case 4:
	            system.showInfo();
	            break;
	        default:
	            System.out.println("Invalid choice. Please try again.");
	    }
	}


}
	